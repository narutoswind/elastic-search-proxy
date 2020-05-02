package cc.sylar.elasticsearch.proxy.beans.search.request.base.source;

import cc.sylar.elasticsearch.proxy.beans.search.request.BaseModel;

/**
 * @author sylar
 * @Description:
 * @date 2019-04-09 09:57
 */
public abstract class BaseSourceModel extends BaseModel {

    <T extends MemberBuilder> BaseSourceModel(MemberBuilder<T> builder) {
        super(builder.name);
    }

    protected abstract static class MemberBuilder<T extends MemberBuilder> {
        private String name;

        protected T name(String name) {
            this.name = name;
            return self();
        }

        protected T self() {
            return (T) this;
        }

        /**
         * 构建对应model
         * @return
         */
        public abstract BaseSourceModel build();
    }
}
