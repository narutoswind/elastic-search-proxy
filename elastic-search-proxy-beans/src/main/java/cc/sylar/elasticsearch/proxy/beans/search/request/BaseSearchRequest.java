package cc.sylar.elasticsearch.proxy.beans.search.request;

import cc.sylar.elasticsearch.proxy.beans.context.SearchContext;
import cc.sylar.elasticsearch.proxy.beans.search.request.elevation.ElevationFactor;
import cc.sylar.elasticsearch.proxy.beans.search.request.page.PageInfo;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author sylar
 * @Description:
 * @date 2018/11/15 11:09 AM
 */
public class BaseSearchRequest implements Serializable {
    /**
     * 搜索参数
     */
    private SearchSourceModelBuilder searchSourceModelBuilder;

    /**
     * 提权因子
     */
    private ElevationFactor elevationFactor;

    /**
     * 分页参数
     */
    private PageInfo pageInfo;

    /**
     * generate search key for multi search
     * This is used to be key which gets result from multi result
     *
     * @return
     */
    public String generateSearchKey() {
        return hashCode() + "";
    }

    public SearchContext generateContext() {
        return new SearchContext(this);
    }

    public SearchSourceModelBuilder getSearchSourceModelBuilder() {
        return searchSourceModelBuilder;
    }

    public void setSearchSourceModelBuilder(SearchSourceModelBuilder searchSourceModelBuilder) {
        this.searchSourceModelBuilder = searchSourceModelBuilder;
    }

    public ElevationFactor getElevationFactor() {
        return elevationFactor;
    }

    public void setElevationFactor(ElevationFactor elevationFactor) {
        this.elevationFactor = elevationFactor;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null
                || getClass() != o.getClass()) {
            return false;
        }
        BaseSearchRequest that = (BaseSearchRequest) o;
        return Objects.equals(searchSourceModelBuilder, that.searchSourceModelBuilder) &&
                Objects.equals(pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(searchSourceModelBuilder, pageInfo);
    }

    @Override
    public String toString() {
        return "SearchBaseRequest{" +
                "searchSourceModelBuilder=" + searchSourceModelBuilder +
                ", elevationFactor=" + elevationFactor +
                ", pageInfo=" + pageInfo +
                '}';
    }
}
