package cc.sylar.elasticsearch.proxy.beans.search.request;

import cc.sylar.elasticsearch.proxy.beans.search.request.base.QueryModel;
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
public class QueryModelBuilder implements Serializable {

    private List<QueryModel> or = new ArrayList<>();
    private List<QueryModel> and = new ArrayList<>();
    private List<QueryModel> not = new ArrayList<>();

    private QueryModelBuilder() {
    }

    public static QueryModelBuilder newBuilder() {
        return new QueryModelBuilder();
    }

    public QueryModelBuilder or(QueryModel queryModel) {
        if (queryModel == null) {
            return this;
        }
        or.add(queryModel);
        return this;
    }

    public QueryModelBuilder and(QueryModel queryModel) {
        if (queryModel == null) {
            return this;
        }
        and.add(queryModel);
        return this;
    }

    public QueryModelBuilder not(QueryModel queryModel) {
        if (queryModel == null) {
            return this;
        }
        not.add(queryModel);
        return this;
    }

    public boolean isEmptySearch() {
        return CollectionUtils.isEmpty(or)
                && CollectionUtils.isEmpty(and)
                && CollectionUtils.isEmpty(not);
    }

    public List<QueryModel> getOr() {
        return or;
    }

    public List<QueryModel> getAnd() {
        return and;
    }

    public List<QueryModel> getNot() {
        return not;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof QueryModelBuilder)) {
            return false;
        }
        QueryModelBuilder that = (QueryModelBuilder) o;
        return or.equals(that.or) &&
                and.equals(that.and) &&
                not.equals(that.not);
    }

    @Override
    public int hashCode() {
        return Objects.hash(or, and, not);
    }

    @Override
    public String toString() {
        return "QueryModelBuilder{" +
                "or=" + or +
                ", and=" + and +
                ", not=" + not +
                '}';
    }
}
