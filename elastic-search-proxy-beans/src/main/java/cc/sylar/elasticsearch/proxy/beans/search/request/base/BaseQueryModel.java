package cc.sylar.elasticsearch.proxy.beans.search.request.base;

import java.util.Objects;

/**
 * @author sylar
 * @Description: 匹配过滤
 * @date 2018/10/31 5:09 PM
 */
public abstract class BaseQueryModel<V> extends BaseModel {
    /**
     * value
     */
    private V value;

    protected <T extends BaseMemberBuilder> BaseQueryModel(BaseMemberBuilder<T, V> builder) {
        super(builder.name);
        this.value = builder.value;
    }

    protected V getValue() {
        return value;
    }

    protected abstract static class BaseMemberBuilder<T extends BaseMemberBuilder, V> {

        private String name;

        private V value;

        protected T name(String name) {
            this.name = name;
            return self();
        }

        protected T value(V value) {
            this.value = value;
            return self();
        }

        /**
         * 返回实际 builder 实例
         * @return
         */
        protected T self() {
            return (T) this;
        }

        /**
         *
         * @return
         */
        public abstract BaseQueryModel build();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BaseQueryModel)) {
            return false;
        }
        BaseQueryModel<?> that = (BaseQueryModel<?>) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "BaseSearchModel{" +
                "value=" + value +
                "} " + super.toString();
    }
}
