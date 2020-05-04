package cc.sylar.elasticsearch.proxy.beans.search.request.base.source;

import cc.sylar.elasticsearch.proxy.beans.search.request.ScriptGetter;
import cc.sylar.elasticsearch.proxy.beans.search.request.base.BaseQueryModel;

/**
 * @author sylar
 * @Description:
 * @date 2019-04-09 09:58
 */
public abstract class BaseScriptSourceModel<V> extends BaseSourceModel<V> implements ScriptGetter<V> {

    private String field;

    <T extends BaseScriptSourceMemberBuilder<T, V>> BaseScriptSourceModel(BaseScriptSourceMemberBuilder<T, V> builder) {
        super(builder);
        this.field = builder.field;
    }

    @Override
    public String getField() {
        return this.field;
    }

    @Override
    public String getScriptId() {
        return super.getName();
    }

    protected abstract static class BaseScriptSourceMemberBuilder<T extends BaseScriptSourceMemberBuilder<T, V>, V> extends
            BaseQueryModel.BaseMemberBuilder<T, V> {

        private String field;

        public T scriptId(String scriptId) {
            super.name(scriptId);
            return self();
        }

        public T field(String field) {
            this.field = field;
            return self();
        }

        @Override
        public abstract BaseScriptSourceModel build();
    }
}
