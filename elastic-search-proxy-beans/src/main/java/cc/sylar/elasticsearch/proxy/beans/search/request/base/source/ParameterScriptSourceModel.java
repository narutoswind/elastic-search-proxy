package cc.sylar.elasticsearch.proxy.beans.search.request.base.source;

import cc.sylar.elasticsearch.proxy.beans.common.ScriptParamsConverter;
import cc.sylar.elasticsearch.proxy.beans.search.request.fuction.ScriptSetter;

import java.util.Map;

/**
 * @author sylar
 * @Description: 基础script score模型
 * scriptId -> scriptId：script id
 * paramMap -> Map<String,Object>：script params
 * @date 2019-02-25 15:32
 */
public class ParameterScriptSourceModel extends BaseScriptSourceModel<Map<String, Object>> {

    private ParameterScriptSourceModel(ParameterScriptSourceBuilder builder) {
        super(builder);
    }

    @Override
    public Map<String, Object> getScriptParameters() {
        return super.getValue();
    }

    public static ParameterScriptSourceBuilder newBuilder() {
        return new ParameterScriptSourceBuilder();
    }

    public static final class ParameterScriptSourceBuilder extends
            BaseScriptSourceMemberBuilder<ParameterScriptSourceBuilder, Map<String, Object>> implements ScriptSetter {
        private ParameterScriptSourceBuilder() {
        }

        @Override
        public ParameterScriptSourceBuilder parameter(Map<String, Object> parameterMap) {
            return super.value(parameterMap);
        }

        @Override
        public ParameterScriptSourceBuilder parameter(ScriptParamsConverter scriptParamsConverter) {
            return (ParameterScriptSourceBuilder) ScriptSetter.super.parameter(scriptParamsConverter);
        }

        @Override
        public ParameterScriptSourceModel build() {
            return new ParameterScriptSourceModel(this);
        }
    }

}
