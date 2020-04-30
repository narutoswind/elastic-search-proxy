package cc.sylar.elasticsearch.proxy.core.search;

import cc.sylar.elasticsearch.proxy.beans.search.request.MultiSearchScenarioRequest;
import cc.sylar.elasticsearch.proxy.beans.search.request.SearchScenarioRequest;
import cc.sylar.elasticsearch.proxy.beans.search.response.common.MultiBaseSearchResponse;
import cc.sylar.elasticsearch.proxy.beans.search.response.common.SingleBaseSearchResponse;

/**
 * @author sylar
 * @Description: search cargoes with Scenario
 * @date 2018/11/15 11:07 AM
 */
public interface SearchScenarioService {

    /**
     * 单查询信息
     * warning:在查询结果集返回 null 的时候,T 可能会返回 null ,调用方法自行处理。
     * @see SingleBaseSearchResponse
     * @param searchScenarioRequest
     * @return
     */
    SingleBaseSearchResponse search(SearchScenarioRequest searchScenarioRequest);

    /**
     * 多路查询
     * @see MultiBaseSearchResponse
     * @param multiSearchScenarioRequest
     * @return
     */
    MultiBaseSearchResponse multiSearch(MultiSearchScenarioRequest multiSearchScenarioRequest);
}
