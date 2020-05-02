package cc.sylar.elasticsearch.proxy.core.search.filter;


/**
 * @author sylar
 * @Description: search request parameters filter
 * @date 2018/10/29 3:35 PM
 */
public interface SearchRequestFilter {

    /**
     * Used to verify parameters
     * @param searchBaseRequest
     * @throws EsRecallException
     * When an illegal parameter occurs
     */
    void filterRequest(SearchBaseRequest searchBaseRequest) throws EsRecallException;
}
