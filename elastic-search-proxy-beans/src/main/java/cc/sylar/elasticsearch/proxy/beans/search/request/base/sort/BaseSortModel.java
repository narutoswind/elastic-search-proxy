package cc.sylar.elasticsearch.proxy.beans.search.request.base.sort;

import cc.sylar.elasticsearch.proxy.beans.search.request.FieldGetter;
import cc.sylar.elasticsearch.proxy.beans.search.request.base.BaseQueryModel;

/**
 * @author sylar
 * @Description:
 * @date 2019-02-25 11:27
 */
public abstract class BaseSortModel<V> extends BaseQueryModel<V> implements FieldGetter {
    /**
     * sort model
     */
    private SortModel sortModel;

    <T extends BaseSortMemberBuilder<T, V>> BaseSortModel(BaseSortMemberBuilder<T, V> builder) {
        super(builder);
        sortModel = builder.sortModel;
    }

    public SortModel getSortModel() {
        return sortModel;
    }

    @Override
    public String getField() {
        return super.getName();
    }

    protected static abstract class BaseSortMemberBuilder<T extends BaseSortMemberBuilder<T, V>, V> extends
            BaseMemberBuilder<T, V>{

        private SortModel sortModel;

        public T sortModel(SortModel val) {
            sortModel = val;
            return self();
        }

        /**
         * 构建具体BaseSortModel的子类实例
         * @return
         */
        @Override
        public abstract BaseSortModel build();
    }

}
