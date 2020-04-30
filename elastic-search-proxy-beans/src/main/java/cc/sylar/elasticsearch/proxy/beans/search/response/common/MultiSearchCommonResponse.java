package cc.sylar.elasticsearch.proxy.beans.search.response.common;


import cc.sylar.elasticsearch.proxy.beans.search.response.model.ResultWrapper;

import java.io.Serializable;

/**
 * @author sylar
 * @Description:
 * @date 2019-02-26 15:49
 */
public class MultiSearchCommonResponse extends MultiBaseSearchResponse<ResultWrapper> implements Serializable {

    private MultiSearchCommonResponse(MultiSearchCommonResponse.Builder builder) {
        super(builder);
    }

    public static MultiSearchCommonResponse.Builder newBuilder() {
        return new MultiSearchCommonResponse.Builder();
    }

    public static final class Builder extends MultiBaseSearchResponse.Builder<Builder, ResultWrapper> {

        private Builder() {
            super();
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public MultiSearchCommonResponse build() {
            return new MultiSearchCommonResponse(this);
        }
    }
}
