package cc.sylar.elasticsearch.proxy.beans.search.request.base.sort;


import cc.sylar.elasticsearch.proxy.beans.search.request.fuction.ScriptGetter;

/**
 * @author sylar
 * @Description:
 * @date 2020/4/30 11:45 下午
 */
abstract class BaseScriptSortModel<V> extends BaseSortModel<V> implements ScriptGetter<V> {

    <T extends BaseSortMemberBuilder<T, V>> BaseScriptSortModel(BaseSortMemberBuilder<T, V> builder) {
        super(builder);
    }

    @Override
    public String getScriptId() {
        return super.getName();
    }

    abstract static class BaseScriptSortMemberBuilder<T extends BaseScriptSortModel.BaseScriptSortMemberBuilder<T, V>, V> extends
            BaseSortMemberBuilder<T, V> {

        public T scriptId(String scriptId) {
            super.name(scriptId);
            return self();
        }
    }
}
