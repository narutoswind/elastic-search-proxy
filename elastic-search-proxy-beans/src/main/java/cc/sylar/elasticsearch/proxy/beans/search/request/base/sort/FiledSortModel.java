package cc.sylar.elasticsearch.proxy.beans.search.request.base.sort;

/**
 * @author sylar
 * @Description:
 * @date 2020/4/30 10:34 下午
 */
public class FiledSortModel extends BaseSortModel<Void> {

    private <T extends FiledSortMemberBuilder<T>> FiledSortModel(FiledSortMemberBuilder<T> builder) {
        super(builder);
    }

    public static FiledSortModel.FiledSortBuilder newBuilder() {
        return new FiledSortBuilder();
    }

    public static final class FiledSortBuilder extends FiledSortMemberBuilder<FiledSortBuilder> {
        private FiledSortBuilder() {
        }
    }

    private static class FiledSortMemberBuilder<T extends FiledSortModel.FiledSortMemberBuilder<T>> extends BaseSortMemberBuilder<T, Void> {

        private FiledSortMemberBuilder() {}

        public T field(String field) {
            super.name(field);
            return self();
        }

        @Override
        public FiledSortModel build() {
            return new FiledSortModel(this);
        }

    }
}
