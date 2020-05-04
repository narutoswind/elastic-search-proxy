package cc.sylar.elasticsearch.proxy.beans.search.request.base.source;

import cc.sylar.elasticsearch.proxy.beans.search.request.base.BaseQueryModel;

/**
 * @author sylar
 * @Description:
 * @date 2020/5/2 1:07 下午
 */
public class FiledSourceModel extends BaseSourceModel<Void>  {

    private FiledSourceModel(FiledSourceBuilder builder) {
        super(builder);
    }

    public static FiledSourceBuilder newBuilder() {
        return new FiledSourceBuilder();
    }

    @Override
    public String getField() {
        return super.getName();
    }

    public static final class FiledSourceBuilder extends BaseQueryModel.BaseMemberBuilder<FiledSourceBuilder, Void> {

        private FiledSourceBuilder() {
        }
        public FiledSourceBuilder field(String field) {
            super.name(field);
            return self();
        }

        @Override
        public FiledSourceModel build() {
            return new FiledSourceModel(this);
        }

    }
}
