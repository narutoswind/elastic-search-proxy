package cc.sylar.elasticsearch.proxy.beans.search.request.base.sort;

/**
 * @author sylar
 * @Description:
 * @date 2020/4/28 11:52 下午
 */
public class NoneParameterScriptModel extends BaseSortModel {

    private <T extends NoneParameterScriptMemberBuilder<T>> NoneParameterScriptModel(NoneParameterScriptMemberBuilder<T> builder) {
        super(builder);
    }

    public static NoneParameterScriptBuilder newBuilder() {
        return new NoneParameterScriptBuilder();
    }

    public static class NoneParameterScriptBuilder extends NoneParameterScriptMemberBuilder<NoneParameterScriptBuilder> {
        private NoneParameterScriptBuilder() {
        }
    }


    protected static class NoneParameterScriptMemberBuilder<T extends NoneParameterScriptMemberBuilder<T>> extends
            BaseSortModel.BaseSortMemberBuilder<T> {

        public T scriptId(String scriptId) {
            super.name(scriptId);
            return (T) this;
        }

        @Override
        public NoneParameterScriptModel build() {
            return new NoneParameterScriptModel(this);
        }
    }
}
