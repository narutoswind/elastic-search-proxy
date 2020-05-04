package cc.sylar.elasticsearch.proxy.beans.search.request.base.score;

import cc.sylar.elasticsearch.proxy.beans.common.ScriptParamsConverter;
import cc.sylar.elasticsearch.proxy.beans.search.request.ScriptSetter;

import java.util.Map;

/**
 * @author sylar
 * @Description: 基础script score模型
 *               scriptId -> scriptId：script id
 *               paramMap -> Map<String,Object>：script params
 * @date 2019-02-25 15:32
 */
public class ParameterScriptScoreModel extends BaseScriptScoreModel<Map<String, Object>> {

    private ParameterScriptScoreModel(ParameterScriptScoreBuilder builder) {
        super(builder);
    }

    @Override
    public Map<String, Object> getScriptParameters() {
        return super.getValue();
    }

    public static ParameterScriptScoreBuilder newBuilder() {
        return new ParameterScriptScoreBuilder();
    }

    public static final class ParameterScriptScoreBuilder extends
            BaseScoreMemberBuilder<ParameterScriptScoreBuilder, Map<String, Object>> implements ScriptSetter {
        private ParameterScriptScoreBuilder() {
        }

        @Override
        public ParameterScriptScoreBuilder parameter(Map<String, Object> parameterMap) {
            return super.value(parameterMap);
        }

        @Override
        public ParameterScriptScoreBuilder parameter(ScriptParamsConverter scriptParamsConverter) {
            return (ParameterScriptScoreBuilder) ScriptSetter.super.parameter(scriptParamsConverter);
        }

        @Override
        public ParameterScriptScoreModel build() {
            return new ParameterScriptScoreModel(this);
        }
    }

}
