package cc.sylar.elasticsearch.proxy.beans.search.request.base.source;

/**
 * @author sylar
 * @Description:
 * @date 2020/5/4 10:45 下午
 */
public class NoneParameterScriptSourceModel extends BaseScriptSourceModel<Void> {

    private NoneParameterScriptSourceModel(NoneParameterScriptSourceBuilder builder) {
        super(builder);
    }

    @Override
    public Void getScriptParameters() {
        return null;
    }

    public static final class NoneParameterScriptSourceBuilder extends BaseScriptSourceMemberBuilder<NoneParameterScriptSourceBuilder, Void> {

        private NoneParameterScriptSourceBuilder() {
        }

        @Override
        public NoneParameterScriptSourceModel build() {
            return new NoneParameterScriptSourceModel(this);
        }
    }
}
