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

    public PageInfo(){}

    private PageInfo(Builder builder) {
        setPageSize(builder.pageSize);
        setPageNumber(builder.pageNumber);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    @Override
    public String toString() {
        return "PageInfo{" +
                "pageSize=" + pageSize +
                ", pageNumber=" + pageNumber +
                '}';
    }

    public static final class Builder {
        private Integer pageSize;
        private Integer pageNumber;

        private Builder() {
        }

        public Builder pageSize(Integer val) {
            pageSize = val;
            return this;
        }

        public Builder pageNumber(Long val) {
            if(val!=null){
                pageNumber = Integer.valueOf(val.toString());
            }
            return this;
        }

        public PageInfo build() {
            return new PageInfo(this);
        }
    }
}
