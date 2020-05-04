package cc.sylar.elasticsearch.proxy.beans.search.request.base.sort;

import cc.sylar.elasticsearch.proxy.beans.common.ScriptParamsConverter;
import cc.sylar.elasticsearch.proxy.beans.search.request.ScriptSetter;
import com.sun.tools.javac.util.Assert;

import java.util.Map;

/**
 * @author sylar
 * @Description: 基础script 模型
 * name -> scriptId：script id
 * value -> Map<String,Object>：script params
 * @date 2019-02-25 11:29
 */
public class ParameterScriptSortModel extends BaseScriptSortModel<Map<String, Object>> {

    private ParameterScriptSortModel(BaseScriptSortBuilder builder) {
        super(builder);
        Assert.checkNull(this.getScriptParameters(), "BaseScriptSortModel must has one or more parameter, " +
                "if the script doesn't have parameters, you should use NoneParameterScriptModel.");
    }

    public static BaseScriptSortBuilder newBuilder() {
        return new BaseScriptSortBuilder();
    }

    @Override
    public Map<String, Object> getScriptParameters() {
        return super.getValue();
    }

    public static final class BaseScriptSortBuilder extends BaseScriptSortModel.BaseScriptSortMemberBuilder<BaseScriptSortBuilder,
            Map<String, Object>> implements ScriptSetter {

        private BaseScriptSortBuilder() {
        }

        @Override
        public BaseScriptSortBuilder parameter(Map<String, Object> parameterMap) {
            return super.value(parameterMap);
        }

        @Override
        public BaseScriptSortBuilder parameter(ScriptParamsConverter scriptParamsConverter) {
            return (BaseScriptSortBuilder) ScriptSetter.super.parameter(scriptParamsConverter);
        }

        @Override
        public ParameterScriptSortModel build() {
            return new ParameterScriptSortModel(this);
        }
    }

}
