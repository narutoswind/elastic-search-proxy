package cc.sylar.elasticsearch.proxy.beans.search.request.base;

import cc.sylar.elasticsearch.proxy.beans.search.request.BaseModel;

import java.util.Objects;

/**
 * @author sylar
 * @Description: 匹配过滤
 * @date 2018/10/31 5:09 PM
 */
public class BaseSearchModel<V> extends BaseModel {
    /**
     * value
     */
    private V value;

    protected <T extends MemberBuilder> BaseSearchModel(MemberBuilder<T, V> builder) {
        super(builder.name);
        this.value = builder.value;
    }

    public V getValue() {
        return value;
    }


    public static class Builder<V>  extends MemberBuilder<Builder, V>{

    }

    protected static class MemberBuilder<T extends MemberBuilder, V> {

        public String name;

        public V value;

        public T name(String val) {
            name = val;
            return self();
        }

        public T value(V val) {
            value = val;
            return self();
        }
        
        /**
         * 返回实际 builder 实例
         * @return
         */
        protected T self() {
            return (T) this;
        }

        public BaseSearchModel build() {
            return new BaseSearchModel<>(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BaseSearchModel)) {
            return false;
        }
        BaseSearchModel<?> that = (BaseSearchModel<?>) o;
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
