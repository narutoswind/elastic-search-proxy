package cc.sylar.elasticsearch.proxy.core.search.filter;

import cc.sylar.elasticsearch.proxy.beans.context.SearchContext;
import cc.sylar.elasticsearch.proxy.beans.exception.EsRecallException;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sylar
 * @Description:
 * @date 2018/11/2 2:50 PM
 */
public class RequestFilterChain {

    private List<SearchRequestFilter> searchRequestFilterList = new ArrayList<>();

    public RequestFilterChain addFilter(SearchRequestFilter searchRequestFilter){
        this.searchRequestFilterList.add(searchRequestFilter);
        return this;
    }

    public void filter(SearchContext searchContext) throws EsRecallException {
        for (SearchRequestFilter searchRequestFilter : searchRequestFilterList) {
            searchRequestFilter.filterRequest(searchContext);
        }
    }
}
