package cc.sylar.elasticsearch.proxy.beans.search.response.common;

import cc.sylar.elasticsearch.proxy.beans.search.response.BaseSearchResponse;
import cc.sylar.elasticsearch.proxy.beans.search.response.model.PageResult;

import java.io.Serializable;
import java.util.List;

/**
 * @author sylar
 * @Description:
 * @date 2019-02-26 16:07
 */
public class SingleBaseSearchResponse<V> extends BaseSearchResponse implements Serializable {

    private List<V> itemList;

    private PageResult pageResult;

    public SingleBaseSearchResponse() {
    }

    protected <T extends Builder> SingleBaseSearchResponse(Builder<T, V> builder) {
        pageResult = builder.pageResult;
        itemList = builder.itemList;
    }

    public static <T extends Builder, V> Builder newBuilder() {
        return new <T, V>SingleBaseSearchResponse.Builder();
    }

    public List<V> getItemList() {
        return itemList;
    }

    public PageResult getPageResult() {
        return pageResult;
    }

    public void setItemList(List<V> itemList) {
        this.itemList = itemList;
    }

    public void setPageResult(PageResult pageResult) {
        this.pageResult = pageResult;
    }

    public static class Builder<T extends Builder, V> {
        private List<V> itemList;
        private PageResult pageResult;

        protected Builder() {
        }

        public T itemList(List<V> val) {
            itemList = val;
            return self();
        }

        public T pageResult(PageResult val) {
            pageResult = val;
            return self();
        }

        protected T self() {
            return (T) this;
        }

        public SingleBaseSearchResponse build() {
            return new <T>SingleBaseSearchResponse(this);
        }
    }

    @Override
    public String toString() {
        return "SingleBaseSearchResponse{" +
                "itemList=" + itemList +
                ", pageResult=" + pageResult +
                "} " + super.toString();
    }
}
