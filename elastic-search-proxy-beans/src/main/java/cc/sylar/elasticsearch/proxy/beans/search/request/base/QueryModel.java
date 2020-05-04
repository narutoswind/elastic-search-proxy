package cc.sylar.elasticsearch.proxy.beans.search.request.base;

/**
 * @author sylar
 * @Description:
 * @date 2020/5/4 8:36 下午
 */
public class QueryModel<V> extends BaseQueryModel<V> {

    private <T extends BaseMemberBuilder<T,V>> QueryModel(BaseMemberBuilder<T, V> builder) {
        super(builder);
    }

    public static <V> Builder<V> newBuilder() {
        return new Builder<>();
    }

    public static final class Builder<V>  extends BaseMemberBuilder<Builder<V>, V> {

        private Builder() {
        }

        @Override
        public Builder<V> name(String name) {
            return super.name(name);
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
