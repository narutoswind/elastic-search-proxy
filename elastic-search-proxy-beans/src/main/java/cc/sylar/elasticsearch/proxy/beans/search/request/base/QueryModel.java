package cc.sylar.elasticsearch.proxy.beans.search.request.base;

import cc.sylar.elasticsearch.proxy.beans.search.request.QueryModelBuilder;
import cc.sylar.elasticsearch.proxy.beans.search.request.fuction.FieldGetter;

/**
 * @author sylar
 * @Description:
 * @date 2020/5/4 8:36 下午
 */
// TODO: 2020/5/5 add query type，match，term，fuzzy... 
public class QueryModel<V> extends BaseQueryModel<V> implements FieldGetter {
    /**
     * inner search model
     * nested search：sub query based on current query conditions
     */
    private QueryModelBuilder innerSearch;

    private  QueryModel(Builder<V> builder) {
        super(builder);
        this.innerSearch = builder.searchModelBuilder;
    }

    public static <V> Builder<V> newBuilder() {
        return new Builder<>();
    }

    @Override
    public String getField() {
        return super.getName();
    }

    public QueryModelBuilder getInnerSearch() {
        return innerSearch;
    }

    public static final class Builder<V>  extends BaseMemberBuilder<Builder<V>, V> {

        private QueryModelBuilder searchModelBuilder;

        private Builder() {
        }

        public Builder<V> innerSeach(QueryModelBuilder innerSearch) {
            this.searchModelBuilder = innerSearch;
            return this;
        }

        public Builder<V> field(String field) {
            return super.name(field);
        }

        @Override
        public Builder<V> value(V value) {
            return super.value(value);
        }

        @Override
        public QueryModel<V> build() {
            return new QueryModel<>(this);
        }
    }
}
