package cc.sylar.elasticsearch.proxy.beans.search.request.base.score;

/**
 * @author sylar
 * @Description:
 * @date 2020/4/28 11:27 下午
 */
public class NoneParameterScriptScoreModel extends BaseScriptScoreModel<Void> {

    private NoneParameterScriptScoreModel(NoneParameterScriptScoreBuilder builder) {
        super(builder);
    }

    public static NoneParameterScriptScoreBuilder newBuilder() {
        return new NoneParameterScriptScoreBuilder();
    }

    public static final class NoneParameterScriptScoreBuilder extends BaseScoreMemberBuilder<NoneParameterScriptScoreBuilder, Void> {

        private NoneParameterScriptScoreBuilder() {
        }

        @Override
        public NoneParameterScriptScoreModel build() {
            return new NoneParameterScriptScoreModel(this);
        }
    }

}
