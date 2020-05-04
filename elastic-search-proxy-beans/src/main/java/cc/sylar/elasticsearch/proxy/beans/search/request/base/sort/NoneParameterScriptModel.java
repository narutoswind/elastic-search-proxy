package cc.sylar.elasticsearch.proxy.beans.search.request.base.sort;

/**
 * @author sylar
 * @Description:
 * @date 2020/4/28 11:52 下午
 */
public class NoneParameterScriptModel extends BaseScriptSortModel<Void> {

    private NoneParameterScriptModel(NoneParameterBuilder builder) {
        super(builder);
    }

    public static NoneParameterBuilder newBuilder() {
        return new NoneParameterBuilder();
    }

    public static final class NoneParameterBuilder extends BaseScriptSortMemberBuilder<NoneParameterBuilder, Void> {
        private NoneParameterBuilder() {
        }

        @Override
        public NoneParameterScriptModel build() {
            return new NoneParameterScriptModel(this);
        }
    }
}
