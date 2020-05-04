package cc.sylar.elasticsearch.proxy.beans.search.request.range;

import cc.sylar.elasticsearch.proxy.beans.search.request.base.BaseQueryModel;

/**
 * @author sylar
 * @Description: 范围过滤
 * @date 2018/10/31 5:10 PM
 */
public class BaseRangeSearchModel<V> extends BaseQueryModel<RangeQuery<V>> {

    private BaseRangeSearchModel(Builder<V> builder) {
        super(builder);
    }

    public static <V> Builder<V> newBuilder() {
        return new Builder<>();
    }

    public RangeQuery<V> getRange() {
        return super.getValue();
    }

    public static final class Builder<V> extends BaseQueryModel.BaseMemberBuilder<Builder<V>, RangeQuery<V>> {

        private Builder() {
        }

        public Builder<V> range(RangeQuery<V> rangeQuery) {
            return super.value(rangeQuery);
        }

        @Override
        public BaseRangeSearchModel<V> build() {
            return new BaseRangeSearchModel<>(this);
        }
    }
}
