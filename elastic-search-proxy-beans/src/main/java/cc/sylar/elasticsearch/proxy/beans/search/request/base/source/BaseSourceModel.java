package cc.sylar.elasticsearch.proxy.beans.search.request.base.source;

import cc.sylar.elasticsearch.proxy.beans.search.request.BaseModel;

/**
 * @author sylar
 * @Description:
 * @date 2019-04-09 09:57
 */
public class BaseSourceModel extends BaseModel {

    protected BaseSourceModel(Builder builder) {
        super(builder.fieldName);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static class Builder<T extends Builder> {
        private String fieldName;

        protected Builder() {
        }

        public T fieldName(String val) {
            fieldName = val;
            return self();
        }

        protected T self() {
            return (T) this;
        }

        public BaseSourceModel build() {
            return new BaseSourceModel(this);
        }
    }
}
