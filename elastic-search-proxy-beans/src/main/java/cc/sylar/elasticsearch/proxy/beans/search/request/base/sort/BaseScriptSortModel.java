package cc.sylar.elasticsearch.proxy.beans.search.request.base.sort;

/**
 * @author sylar
 * @Description:
 * @date 2020/4/30 11:45 下午
 */
public abstract class BaseScriptSortModel extends BaseSortModel {

    <T extends BaseSortMemberBuilder<T>> BaseScriptSortModel(BaseSortMemberBuilder<T> builder) {
        super(builder);
    }


    abstract static class BaseScriptSortMemberBuilder<T extends BaseScriptSortModel.BaseScriptSortMemberBuilder<T>> extends
            BaseSortModel.BaseSortMemberBuilder<T> {

        public T scriptId(String scriptId) {
            super.name(scriptId);
            return (T) this;
        }
    }
}
