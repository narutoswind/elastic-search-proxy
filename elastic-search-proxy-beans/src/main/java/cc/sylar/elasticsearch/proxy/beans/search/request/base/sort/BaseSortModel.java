package cc.sylar.elasticsearch.proxy.beans.search.request.base.sort;

import cc.sylar.elasticsearch.proxy.beans.search.request.BaseModel;

/**
 * @author sylar
 * @Description:
 * @date 2019-02-25 11:27
 */
public abstract class BaseSortModel extends BaseModel {
    /**
     * sort model
     */
    private SortModel sortModel;

    <T extends BaseSortMemberBuilder<T>> BaseSortModel(BaseSortMemberBuilder<T> builder) {
        super(builder.name);
        sortModel = builder.sortModel;
    }

    public SortModel getSortModel() {
        return sortModel;
    }

    public static abstract class BaseSortMemberBuilder<T extends BaseSortMemberBuilder<T>> {

        protected String name;

        protected SortModel sortModel;

        protected T name(String name) {
            this.name = name;
            return (T) this;
        }

        public T sortModel(SortModel val) {
            sortModel = val;
            return (T) this;
        }

        /**
         * 构建具体BaseSortModel的子类实例
         * @return
         */
        public abstract BaseSortModel build();
    }

}
