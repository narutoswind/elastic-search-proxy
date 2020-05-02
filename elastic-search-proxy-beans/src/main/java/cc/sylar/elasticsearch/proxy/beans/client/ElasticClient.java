package cc.sylar.elasticsearch.proxy.beans.client;

import org.apache.http.HttpHost;
import org.elasticsearch.client.Node;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.elasticsearch.client.RestHighLevelClient;

import java.io.IOException;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author sylar
 * @Description: es rest client
 * @date 2018/10/22 6:32 PM
 */
public class ElasticClient {
    /**
     * name of es cluster
     */
    private final String clusterName;

    /**
     *
     */
    private final RestHighLevelClient restHighLevelClient;


    public ElasticClient(String clusterName, String host, Integer port) {
        this(clusterName, host, port, null);
    }

    public ElasticClient(String clusterName, String host, Integer port, Consumer<Node> failureListener) {
        this.clusterName = clusterName;
        List<HttpHost> addressList = Stream.of(host.split(",")).map(singleHost ->
                new HttpHost(singleHost, port)).collect(Collectors.toList());
        RestClientBuilder builder = RestClient.builder(addressList.toArray(new HttpHost[]{}));
        if (failureListener != null) {
            builder.setFailureListener(new RestClient.FailureListener() {
                @Override
                public void onFailure(Node node) {
                    failureListener.accept(node);
                }
            });
        }
        this.restHighLevelClient = new RestHighLevelClient(builder);
    }

    /**
     * rest client which requests with http
     *
     * @return
     */
    public RestHighLevelClient getRestClient() {
        return restHighLevelClient;
    }

    /**
     * getter
     *
     * @return
     */
    protected String getClusterName() {
        return clusterName;
    }

    public void destroy() {
        if (restHighLevelClient != null) {
            try {
                restHighLevelClient.close();
            } catch (IOException e) {

            }
        }
    }
}
