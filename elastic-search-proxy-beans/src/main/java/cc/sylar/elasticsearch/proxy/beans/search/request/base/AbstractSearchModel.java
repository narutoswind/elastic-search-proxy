package cc.sylar.elasticsearch.proxy.beans.search.request.base;


import cc.sylar.elasticsearch.proxy.beans.search.request.search.SearchModelBuilder;
import org.apache.commons.lang.StringUtils;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author sylar
 * @Description:
 * @date 2018/10/30 2:44 PM
 */
public abstract class AbstractSearchModel extends BaseModel implements Serializable {

    /**
     * inner search model
     * nested search：sub query based on current query conditions
     */
    private SearchModelBuilder innerSearchModel;

    public AbstractSearchModel(String fieldName) {
        super(fieldName);
    }

    public SearchModelBuilder getInnerSearchModel() {
        return innerSearchModel;
    }

    protected void setInnerSearchModel(SearchModelBuilder innerSearchModel) {
        this.innerSearchModel = innerSearchModel;
    }

    public boolean isEmptySearch() {
        return StringUtils.isEmpty(super.getName())
                && (innerSearchModel == null || innerSearchModel.isEmptySearch());
    }

    public boolean isEmptyInnerSearch() {
        return innerSearchModel == null || innerSearchModel.isEmptySearch();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AbstractSearchModel)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        AbstractSearchModel that = (AbstractSearchModel) o;
        return Objects.equals(innerSearchModel, that.innerSearchModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), innerSearchModel);
    }

    @Override
    public String toString() {
        return "AbstractSearchModel{" +
                "innerSearchModel=" + innerSearchModel +
                "} " + super.toString();
    }
}
