package cc.sylar.elasticsearch.proxy.beans.search.request.page;

import java.io.Serializable;

/**
 * @author sylar
 * @Description: 分页信息
 * @date 2018/8/27 下午3:17
 */
public class PageInfo implements Serializable {

    private Integer pageSize;

    private Integer pageNumber;

    protected PageInfo(Builder builder) {
        this.pageSize = builder.pageSize;
        this.pageNumber = builder.pageNumber;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public static class Builder {
        private Integer pageSize;
        private Integer pageNumber;

        protected Builder() {}

        public Builder pageSize(Integer val) {
            pageSize = val;
            return this;
        }

        public Builder pageNumber(Integer val) {
            pageNumber = val;
            return this;
        }

        public PageInfo build() {
            return new PageInfo(this);
        }
    }


    @Override
    public String toString() {
        return "PageInfo{" +
                "pageSize=" + pageSize +
                ", pageNumber=" + pageNumber +
                '}';
    }

}
