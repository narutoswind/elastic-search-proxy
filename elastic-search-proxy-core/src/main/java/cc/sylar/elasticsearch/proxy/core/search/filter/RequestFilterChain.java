package cc.sylar.elasticsearch.proxy.core.search.filter;

import com.ymm.cargo.es.api.base.exception.EsRecallException;
import com.ymm.cargo.es.api.request.SearchBaseRequest;

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

    public void filter(SearchBaseRequest searchBaseRequest) throws EsRecallException {
        for (SearchRequestFilter searchRequestFilter : searchRequestFilterList) {
            searchRequestFilter.filterRequest(searchBaseRequest);
        }
    }
}
