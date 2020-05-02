package cc.sylar.elasticsearch.proxy.beans.search.response.common;

import cc.sylar.elasticsearch.proxy.beans.search.response.model.ResultWrapper;

import java.io.Serializable;
import java.util.List;

/**
 * @author sylar
 * @Description:
 * @date 2018/10/22 3:32 PM
 */
public class SingleSearchCommonResponse extends SingleBaseSearchResponse<ResultWrapper> implements Serializable {
    public SingleSearchCommonResponse() {
    }

    private SingleSearchCommonResponse(SingleSearchCommonResponse.Builder builder) {
        super(builder);
    }

    public static SingleSearchCommonResponse.Builder newBuilder() {
        return new SingleSearchCommonResponse.Builder();
    }

    public static final class Builder extends SingleBaseSearchResponse.Builder<Builder, ResultWrapper> {

        private Builder() {
            super();
        }

        @Override
        protected SingleSearchCommonResponse.Builder self() {
            return this;
        }

        @Override
        public SingleSearchCommonResponse build() {
            return new SingleSearchCommonResponse(this);
        }
    }

    public <T> List<T> parseResult (Class<T> clazz) {
        return TransformerUtils.parseResult(getItemList(), clazz);
    }
}
