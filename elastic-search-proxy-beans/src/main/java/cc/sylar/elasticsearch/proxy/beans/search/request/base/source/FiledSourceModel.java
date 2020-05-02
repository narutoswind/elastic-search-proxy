package cc.sylar.elasticsearch.proxy.beans.search.request.base.source;

/**
 * @author sylar
 * @Description:
 * @date 2020/5/2 1:07 下午
 */
public class FiledSourceModel extends BaseSourceModel {

    protected <T extends FiledSourceMemberBuilder<T>> FiledSourceModel(FiledSourceMemberBuilder<T> builder) {
        super(builder);
    }

    public static FiledSourceBuilder newBuilder() {
        return new FiledSourceBuilder();
    }


    public static final class FiledSourceBuilder extends FiledSourceMemberBuilder<FiledSourceBuilder> {
        private FiledSourceBuilder() {
        }
    }

    private static class FiledSourceMemberBuilder<T extends FiledSourceMemberBuilder<T>> extends BaseSourceModel.MemberBuilder<T> {

        private FiledSourceMemberBuilder() {}

        public T field(String field) {
            super.name(field);
            return (T) this;
        }

        @Override
        public FiledSourceModel build() {
            return new FiledSourceModel(this);
        }

    }
}
