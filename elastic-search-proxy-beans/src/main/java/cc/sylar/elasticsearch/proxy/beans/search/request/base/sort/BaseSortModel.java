package cc.sylar.elasticsearch.proxy.beans.search.request.base.sort;

import cc.sylar.elasticsearch.proxy.beans.search.request.base.BaseSearchModel;

/**
 * @author sylar
 * @Description:
 * @date 2019-02-25 11:27
 */
public class BaseSortModel<V> extends BaseSearchModel<V> {
    /**
     * sort model
     */
    private SortModel sortModel;

    BaseSortModel(BaseSortModel.Builder<?, V> builder) {
        super(builder);
        sortModel = builder.sortModel;
    }

    public SortModel getSortModel() {
        return sortModel;
    }

    public static class Builder<T extends BaseSortModel.Builder<T, V>, V> extends BaseSearchModel.Builder<T, V> {

        protected SortModel sortModel;

        public T sortModel(SortModel val) {
            sortModel = val;
            return super.self();
        }

        @Override
        public BaseSortModel build() {
            return new BaseSortModel<>(this);
        }
    }
}
