package cc.sylar.elasticsearch.proxy.core.search;

import cc.sylar.elasticsearch.proxy.beans.context.SearchContext;
import cc.sylar.elasticsearch.proxy.beans.search.response.BaseSearchResponse;

import java.util.Map;

/**
 * @author sylar
 * @Description:
 * @date 2018/11/15 11:07 AM
 */
public interface SearchScenarioService {

    /**
     * 单查询信息
     * @see BaseSearchResponse
     * @param searchContext
     * @return
     */
    BaseSearchResponse search(SearchContext searchContext);

    /**
     * 多路查询
     * @see BaseSearchResponse
     * @param multiSearchScenarioRequest
     * @return
     */
    Map<String, BaseSearchResponse> multiSearch(MultiSearchScenarioRequest multiSearchScenarioRequest);
}
