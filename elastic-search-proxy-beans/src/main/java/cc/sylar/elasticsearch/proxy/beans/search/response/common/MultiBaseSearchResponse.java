package cc.sylar.elasticsearch.proxy.beans.search.response.common;

import cc.sylar.elasticsearch.proxy.beans.search.response.BaseSearchResponse;

import java.io.Serializable;
import java.util.Map;

/**
 * @author sylar
 * @Description:
 * @date 2019-02-26 16:38
 */
public class MultiBaseSearchResponse<V> extends BaseSearchResponse implements Serializable {

    private Map<String, SingleBaseSearchResponse<V>> multiResult;

    protected MultiBaseSearchResponse(Builder builder) {
        multiResult = builder.multiResult;
    }

    public static <T extends Builder, V>Builder<T, V> newBuilder() {
        return new Builder();
    }

    public Map<String, SingleBaseSearchResponse<V>> getMultiResult() {
        return multiResult;
    }

    public void setMultiResult(Map<String, SingleBaseSearchResponse<V>> multiResult) {
        this.multiResult = multiResult;
    }

    public static class Builder<T extends Builder, V> {
        private Map<String, SingleBaseSearchResponse<V>> multiResult;

        protected Builder() {
        }

        public T multiResult(Map<String, SingleBaseSearchResponse<V>> val) {
            multiResult = val;
            return self();
        }

        protected T self() {
            return (T) this;
        }

        public MultiBaseSearchResponse<V> build() {
            return new MultiBaseSearchResponse(this);
        }
    }

    @Override
    public String toString() {
        return "MultiBaseSearchResponse{" +
                "multiResult=" + multiResult +
                "} " + super.toString();
    }
}
