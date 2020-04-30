package cc.sylar.elasticsearch.proxy.beans.search.response.sp;

import com.ymm.cargo.es.api.response.common.SingleBaseSearchResponse;
import com.ymm.sp.protocol.SearchContext;

import java.io.Serializable;
import java.util.Map;

/**
 * @author sylar
 * @Description: customized search platform response
 * @date 2019-01-13 12:14
 */
public class SearchPlatformResponse extends SingleBaseSearchResponse<SearchContext.Item> implements Serializable {

    private Map<String, Object> extendInfo;

    public SearchPlatformResponse() {
    }

    private SearchPlatformResponse(Builder builder) {
        super(builder);
        setExtendInfo(builder.extendInfo);
    }

    public static SearchPlatformResponse.Builder newBuilder() {
        return new Builder();
    }

    public Map<String, Object> getExtendInfo() {
        return extendInfo;
    }

    public void setExtendInfo(Map<String, Object> extendInfo) {
        this.extendInfo = extendInfo;
    }


    @Override
    public String toString() {
        return "SearchPlatformResponse{" +
                "extendInfo=" + extendInfo +
                "} " + super.toString();
    }

    public static final class Builder extends SingleBaseSearchResponse.Builder<Builder,SearchContext.Item> {
        private Map<String, Object> extendInfo;

        private Builder() {
            super();
        }

        public Builder extendInfo(Map<String, Object> val) {
            extendInfo = val;
            return self();
        }

        @Override
        protected SearchPlatformResponse.Builder self() {
            return this;
        }

        @Override
        public SearchPlatformResponse build() {
            return new SearchPlatformResponse(this);
        }
    }
}
