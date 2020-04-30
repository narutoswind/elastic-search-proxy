package cc.sylar.elasticsearch.proxy.beans.search.request.base;


import cc.sylar.elasticsearch.proxy.beans.search.request.BaseModel;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author sylar
 * @Description:
 * @date 2018/10/30 2:44 PM
 */
public abstract class AbstractSearchModel extends BaseModel implements Serializable {

    /**
     * inner search model
     * nested search：subquery based on current query conditions
     */
    private InnerSearchModel innerSearchModel;

    public AbstractSearchModel(String fieldName) {
        super(fieldName);
    }

    public InnerSearchModel getInnerSearchModel() {
        return innerSearchModel;
    }

    protected void setInnerSearchModel(InnerSearchModel innerSearchModel) {
        this.innerSearchModel = innerSearchModel;
    }

    public boolean isEmptyModel() {
        return StringUtils.isEmpty(super.getFieldName())
                && (innerSearchModel == null || innerSearchModel.isEmptyInnerModel());
    }

    public boolean isEmptyInnerModel() {
        return innerSearchModel == null || innerSearchModel.isEmptyInnerModel();
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

    public static class InnerSearchModel implements Serializable {

        private List<AbstractSearchModel> mustList = new ArrayList<>();

        private List<AbstractSearchModel> shouldList = new ArrayList<>();

        private List<AbstractSearchModel> mustNotList = new ArrayList<>();

        public InnerSearchModel must(AbstractSearchModel abstractSearchModel) {
            if (abstractSearchModel == null) {
                return this;
            }
            mustList.add(abstractSearchModel);
            return this;
        }

        public InnerSearchModel should(AbstractSearchModel abstractSearchModel) {
            if (abstractSearchModel == null) {
                return this;
            }
            shouldList.add(abstractSearchModel);
            return this;
        }

        public InnerSearchModel mustNot(AbstractSearchModel abstractSearchModel) {
            if (abstractSearchModel == null) {
                return this;
            }
            mustNotList.add(abstractSearchModel);
            return this;
        }

        public List<AbstractSearchModel> getMustList() {
            return mustList;
        }

        public List<AbstractSearchModel> getShouldList() {
            return shouldList;
        }

        public List<AbstractSearchModel> getMustNotList() {
            return mustNotList;
        }

        public boolean isEmptyInnerModel() {
            return CollectionUtils.isEmpty(mustList)
                    && CollectionUtils.isEmpty(mustNotList)
                    && CollectionUtils.isEmpty(shouldList);
        }

        @Override
        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof InnerSearchModel)) {
                return false;
            }
            InnerSearchModel that = (InnerSearchModel) object;
            return Objects.equals(mustList, that.mustList) &&
                    Objects.equals(shouldList, that.shouldList) &&
                    Objects.equals(mustNotList, that.mustNotList);
        }

        @Override
        public int hashCode() {
            return Objects.hash(mustList, shouldList, mustNotList);
        }

        @Override
        public String toString() {
            return "InnerSearchModel{" +
                    "mustList=" + mustList +
                    ", shouldList=" + shouldList +
                    ", mustNotList=" + mustNotList +
                    '}';
        }
    }
}
