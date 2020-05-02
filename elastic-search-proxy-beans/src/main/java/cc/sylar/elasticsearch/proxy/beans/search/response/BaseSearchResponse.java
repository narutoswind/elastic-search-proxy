package cc.sylar.elasticsearch.proxy.beans.search.response;

import cc.sylar.elasticsearch.proxy.beans.search.response.model.PageResult;
import cc.sylar.elasticsearch.proxy.beans.search.response.model.ResultWrapper;

import java.io.Serializable;
import java.util.List;

/**
 * @author sylar
 * @Description:
 * @date 2019-02-26 16:07
 */
public class BaseSearchResponse implements Serializable {

    private List<ResultWrapper> items;

    private PageResult pageResult;

    private BaseSearchResponse(Builder builder) {
        this.pageResult = builder.pageResult;
        this.items = builder.items;
    }

    public List<ResultWrapper> getItems() {
        return items;
    }

    public PageResult getPageResult() {
        return pageResult;
    }

    public static <T extends Builder, V> Builder newBuilder() {
        return new <T, V>BaseSearchResponse.Builder();
    }

    public static class Builder<T extends Builder> {
        private List<ResultWrapper> items;
        private PageResult pageResult;

        protected Builder() {
        }

        public T items(List<ResultWrapper> items) {
            this.items = items;
            return self();
        }

        public T pageResult(PageResult pageResult) {
            this.pageResult = pageResult;
            return self();
        }

        protected T self() {
            return (T) this;
        }

        public BaseSearchResponse build() {
            return new BaseSearchResponse(this);
        }
    }

    @Override
    public String toString() {
        return "BaseSearchResponse{" +
                "items=" + items +
                ", pageResult=" + pageResult +
                '}';
    }
}
