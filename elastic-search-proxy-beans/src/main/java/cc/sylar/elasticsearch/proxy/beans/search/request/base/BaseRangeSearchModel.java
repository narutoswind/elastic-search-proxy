package cc.sylar.elasticsearch.proxy.beans.search.request.base;

import cc.sylar.elasticsearch.proxy.beans.search.request.range.RangeQuery;

import java.util.Objects;

/**
 * @author sylar
 * @Description: 范围过滤
 * @date 2018/10/31 5:10 PM
 */
public class BaseRangeSearchModel<V> extends AbstractSearchModel {

    private RangeQuery<V> range;

    public BaseRangeSearchModel(String name) {
        super(name);
    }

    public BaseRangeSearchModel(String name, RangeQuery<V> range) {
        super(name);
        this.range = range;
    }

    private BaseRangeSearchModel(Builder<?, V> builder) {
        super(builder.name);
        setRange(builder.range);
        setInnerSearchModel(builder.innerSearchModel);
    }

    public static <T extends Builder<T, V>, V> Builder<T, V> newBuilder() {
        return new <T, V>Builder();
    }

    public RangeQuery<V> getRange() {
        return range;
    }

    public void setRange(RangeQuery<V> range) {
        this.range = range;
    }


    public static class Builder<T extends Builder<T, V>, V> {
        private String name;
        private RangeQuery<V> range;
        private InnerSearchModel innerSearchModel;

        protected Builder() {
        }

        public T name(String val) {
            name = val;
            return self();
        }

        public T range(RangeQuery<V> val) {
            range = val;
            return self();
        }

        public T innerSearchModel(InnerSearchModel val) {
            innerSearchModel = val;
            return self();
        }

        /**
         * 子类应该复写此方法，返回自身 builder 实例
         *
         * @return
         */
        protected T self() {
            return (T) this;
        }

        /**
         * 子类应该复写此方法，返回自身构造
         *
         * @return
         */
        public BaseRangeSearchModel build() {
            return new BaseRangeSearchModel(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BaseRangeSearchModel)) {
            return false;
        }
        BaseRangeSearchModel<?> that = (BaseRangeSearchModel<?>) o;
        return Objects.equals(range, that.range);
    }

    @Override
    public int hashCode() {
        return Objects.hash(range);
    }

    @Override
    public String toString() {
        return "BaseRangeSearchModel{" +
                "range=" + range +
                "} " + super.toString();
    }
}
