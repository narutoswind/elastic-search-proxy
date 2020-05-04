package cc.sylar.elasticsearch.proxy.core.search.filter;


import cc.sylar.elasticsearch.proxy.beans.context.SearchContext;
import cc.sylar.elasticsearch.proxy.beans.exception.EsRecallException;

/**
 * @author sylar
 * @Description:
 * @date 2018/11/2 2:46 PM
 */
public class BaseRequestFilter implements SearchRequestFilter {
    @Override
    public void filterRequest(SearchContext searchBaseRequest) throws EsRecallException {
        if (searchBaseRequest == null) {
            throw new EsRecallException("illegal argument value for searchRequest, SearchRequest can't be null");
        }
    }
}
