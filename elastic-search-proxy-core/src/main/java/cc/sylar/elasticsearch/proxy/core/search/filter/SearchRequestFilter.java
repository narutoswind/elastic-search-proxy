package cc.sylar.elasticsearch.proxy.core.search.filter;


import cc.sylar.elasticsearch.proxy.beans.context.SearchContext;
import cc.sylar.elasticsearch.proxy.beans.exception.EsProxyException;

/**
 * @author sylar
 * @Description: search request parameters verify filter
 * @date 2018/10/29 3:35 PM
 */
public interface SearchRequestFilter {

    /**
     * Used to verify parameters
     * @param searchContext
     * @throws EsProxyException
     * When an illegal parameter occurs
     */
    void filterRequest(SearchContext searchContext) throws EsProxyException;
}
