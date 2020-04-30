package cc.sylar.elasticsearch.proxy.core.search.filter;

import com.ymm.cargo.es.api.base.exception.EsRecallException;
import com.ymm.cargo.es.api.request.SearchBaseRequest;
import org.springframework.stereotype.Component;

/**
 * @author sylar
 * @Description:
 * @date 2018/11/2 2:46 PM
 */
@Component
public class BaseRequestFilter implements SearchRequestFilter {
    @Override
    public void filterRequest(SearchBaseRequest searchBaseRequest) throws EsRecallException {
        if (searchBaseRequest == null) {
            throw new EsRecallException("illegal argument value for searchRequest, SearchRequest can't be null");
        }
    }
}
