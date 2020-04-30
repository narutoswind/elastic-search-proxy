package cc.sylar.elasticsearch.proxy.beans.context;

import cc.sylar.elasticsearch.proxy.beans.client.ElasticClient;
import cc.sylar.elasticsearch.proxy.beans.exception.EsClientInitException;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author sylar
 * @Description:
 * @date 2018/12/4 3:38 PM
 */
public class ElasticClientContext {

    private static ConcurrentHashMap<String, ElasticClient> elasticClientMap = new ConcurrentHashMap<>();

    public static ElasticClient getElasticClient(String cluster) throws EsClientInitException {
        ElasticClient elasticClient = elasticClientMap.get(cluster);
        if (elasticClient ==  null) {
            throw new EsClientInitException(String.format("can't get client with this cluster %s.", cluster));
        }
        return elasticClient;
    }

    public static void setElasticClientMap(String clusterName, ElasticClient elasticClient){
        elasticClientMap.putIfAbsent(clusterName, elasticClient);
    }
}
