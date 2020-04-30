package cc.sylar.elasticsearch.proxy.beans.client;

import cc.sylar.elasticsearch.proxy.beans.context.ElasticClientContext;
import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;

import javax.annotation.PreDestroy;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author sylar
 * @Description: es rest client
 * @date 2018/10/22 6:32 PM
 */
public class ElasticClient {

    private RestHighLevelClient restHighLevelClient;

    /**
     * name of es cluster
     */
    private String clusterName;

    public ElasticClient(String clusterName, String host, Integer port) {
        this.clusterName = clusterName;
        initRestClient(host, port);
        ElasticClientContext.setElasticClientMap(clusterName, this);
    }

    /**
     * rest client which requests with http
     * @return
     */
    public RestHighLevelClient getRestClient(){
        return restHighLevelClient;
    }

    /**
     * getter
     * @return
     */
    protected String getClusterName() {
        return clusterName;
    }

    /**
     * setter
     * @param clusterName
     */
    protected void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * 初始化 es rests client
     * @param host
     * @param port
     * @return
     */
    private void initRestClient(String host, Integer port) {
        List<HttpHost> addressList =  Stream.of(host.split(",")).map(singleHost ->
                new HttpHost(singleHost, port)).collect(Collectors.toList());
        restHighLevelClient = new RestHighLevelClient(RestClient.builder(addressList.toArray(new HttpHost[]{}))
                .setMaxRetryTimeoutMillis(5000)
                .setFailureListener(new RestClient.FailureListener() {
                    public void onFailure(HttpHost host){
                    }
                }));
    }

    @PreDestroy
    private void destroy(){
        if (restHighLevelClient != null) {
            try {
                restHighLevelClient.close();
            } catch (IOException e) {
            }
        }
    }
}
