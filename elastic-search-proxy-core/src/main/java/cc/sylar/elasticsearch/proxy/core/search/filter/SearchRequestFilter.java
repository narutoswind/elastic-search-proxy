package cc.sylar.elasticsearch.proxy.core.search.filter;


import com.ymm.cargo.es.api.base.exception.EsRecallException;
import com.ymm.cargo.es.api.request.SearchBaseRequest;

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
