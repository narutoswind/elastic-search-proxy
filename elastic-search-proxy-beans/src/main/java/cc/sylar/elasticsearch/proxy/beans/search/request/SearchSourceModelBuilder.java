package cc.sylar.elasticsearch.proxy.beans.search.request;

import cc.sylar.elasticsearch.proxy.beans.search.request.base.sort.BaseSortModel;
import cc.sylar.elasticsearch.proxy.beans.search.request.base.source.BaseSourceModel;
import cc.sylar.elasticsearch.proxy.beans.search.request.fuction.Sort;
import cc.sylar.elasticsearch.proxy.beans.search.request.fuction.Source;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author sylar
 * @Description:
 * @date 2018/11/1 10:49 AM
 */
public class SearchSourceModelBuilder implements Sort, Source, Serializable {
    /**
     * query
     */
    private QueryModelBuilder queryModelBuilder;
    /**
     * sort model
     */
    private List<BaseSortModel> sortModelList = new ArrayList<>();
    /**
     * source model
     */
    private List<BaseSourceModel> sourceModelList = new ArrayList<>();

    private SearchSourceModelBuilder searchModel(QueryModelBuilder queryModelBuilder){
        this.queryModelBuilder = queryModelBuilder;
        return this;
    }

    @Override
    public SearchSourceModelBuilder sort(BaseSortModel baseSortModel){
        Objects.requireNonNull(baseSortModel, "sort model can't be null or empty");
        sortModelList.add(baseSortModel);
        return this;
    }
    @Override
    public SearchSourceModelBuilder sort(BaseSortModel... baseSortModel){
        Objects.requireNonNull(baseSortModel, "sort model can't be null or empty");
        sortModelList.addAll(Arrays.stream(baseSortModel).collect(Collectors.toList()));
        return this;
    }

    @Override
    public SearchSourceModelBuilder source(BaseSourceModel baseSourceModel) {
        Objects.requireNonNull(baseSourceModel, "source model can't be null or empty");
        sourceModelList.add(baseSourceModel);
        return this;
    }

    @Override
    public SearchSourceModelBuilder source(BaseSourceModel... baseSourceModel) {
        Objects.requireNonNull(baseSourceModel, "source model can't be null or empty");
        sourceModelList.addAll(Arrays.stream(baseSourceModel).collect(Collectors.toList()));
        return this;
    }

    public QueryModelBuilder getQueryModelBuilder() {
        return queryModelBuilder;
    }

    public List<BaseSortModel> getSortModelList() {
        return sortModelList;
    }

    public List<BaseSourceModel> getSourceModelList() {
        return sourceModelList;
    }

    @Override
    public String toString() {
        return "SearchSourceModelBuilder{" +
                "queryModelBuilder=" + queryModelBuilder +
                ", sortModelList=" + sortModelList +
                ", sourceModelList=" + sourceModelList +
                '}';
    }
}
