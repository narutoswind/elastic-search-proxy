package cc.sylar.elasticsearch.proxy.beans.search.response.model;

import cc.sylar.elasticsearch.proxy.beans.search.request.page.PageInfo;

/**
 * @author sylar
 * @Description:
 * @date 2018/8/28 上午9:52
 */
public class PageResult extends PageInfo {

    private Boolean hasNext;

    private PageResult(ResultBuilder builder) {
        super(builder);
        this.hasNext = getHasNext();
    }

    public static ResultBuilder newResultBuilder() {
        return new ResultBuilder();
    }

    public Boolean getHasNext() {
        return hasNext;
    }

    public static final class ResultBuilder extends PageInfo.Builder{
        private boolean hasNext;

        ResultBuilder(){
            super();
        }

        public ResultBuilder hasNext(boolean val) {
            hasNext = val;
            return this;
        }

        @Override
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
