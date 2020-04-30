package cc.sylar.elasticsearch.proxy.beans.search.request;

import cc.sylar.elasticsearch.proxy.beans.search.request.base.AbstractSearchModel;
import org.apache.commons.collections.CollectionUtils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author sylar
 * @Description:
 * @date 2018/11/1 10:20 AM
 */
public class SearchModelBuilder implements Serializable {

    private List<AbstractSearchModel> shouldSearchModelList = new ArrayList<>();
    private List<AbstractSearchModel> mustSearchModelList = new ArrayList<>();
    private List<AbstractSearchModel> mustNotSearchModelList = new ArrayList<>();


    public SearchModelBuilder should(AbstractSearchModel searchModel){
        if (searchModel == null) {
            return this;
        }
        shouldSearchModelList.add(searchModel);
        return this;
    }

    public SearchModelBuilder must(AbstractSearchModel searchModel){
        if (searchModel == null) {
            return this;
        }
        mustSearchModelList.add(searchModel);
        return this;
    }

    public SearchModelBuilder mustNot(AbstractSearchModel searchModel){
        if (searchModel == null) {
            return this;
        }
        mustNotSearchModelList.add(searchModel);
        return this;
    }

    public boolean isEmptySearch(){
        return CollectionUtils.isEmpty(shouldSearchModelList)
                && CollectionUtils.isEmpty(mustSearchModelList)
                && CollectionUtils.isEmpty(mustNotSearchModelList);
    }

    public List<AbstractSearchModel> getShouldSearchModelList() {
        return shouldSearchModelList;
    }

    public List<AbstractSearchModel> getMustSearchModelList() {
        return mustSearchModelList;
    }

    public List<AbstractSearchModel> getMustNotSearchModelList() {
        return mustNotSearchModelList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SearchModelBuilder)) {
            return false;
        }
        SearchModelBuilder that = (SearchModelBuilder) o;
        return shouldSearchModelList.equals(that.shouldSearchModelList) &&
                mustSearchModelList.equals(that.mustSearchModelList) &&
                mustNotSearchModelList.equals(that.mustNotSearchModelList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shouldSearchModelList, mustSearchModelList, mustNotSearchModelList);
    }

    @Override
    public String toString() {
        return "SearchModelBuilder{" +
                ", shouldSearchModelList=" + shouldSearchModelList +
                ", mustSearchModelList=" + mustSearchModelList +
                ", mustNotSearchModelList=" + mustNotSearchModelList +
                '}';
    }

}
