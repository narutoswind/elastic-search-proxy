package cc.sylar.elasticsearch.proxy.beans.search.response.model;

import com.ymm.cargo.es.api.base.model.PageInfo;

/**
 * @author sylar
 * @Description:
 * @date 2018/8/28 上午9:52
 */
public class PageResult extends PageInfo {

    private Boolean hasNext;

    public PageResult(){}

    private PageResult(ResultBuilder builder) {
        setPageSize(builder.pageSize);
        setPageNumber(builder.pageNumber);
        setHasNext(builder.hasNext);
    }

    public static ResultBuilder newResultBuilder() {
        return new ResultBuilder();
    }

    public Boolean getHasNext() {
        return hasNext;
    }

    public void setHasNext(Boolean hasNext) {
        this.hasNext = hasNext;
    }


    public static final class ResultBuilder {
        private Integer pageSize;
        private Integer pageNumber;
        private Boolean hasNext;

        private ResultBuilder() {
        }

        public ResultBuilder pageSize(Integer val) {
            pageSize = val;
            return this;
        }

        public ResultBuilder pageNumber(Integer val) {
            pageNumber = val;
            return this;
        }

        public ResultBuilder hasNext(Boolean val) {
            hasNext = val;
            return this;
        }

        public PageResult build() {
            return new PageResult(this);
        }
    }

    @Override
    public String toString() {
        return "PageResult{" +
                "hasNext=" + hasNext +
                "} " + super.toString();
    }
}
