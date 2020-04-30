package cc.sylar.elasticsearch.proxy.beans.search.request.base.sort;

import cc.sylar.elasticsearch.proxy.beans.common.ScriptParamsConverter;
import com.sun.tools.javac.util.Assert;

import java.util.Map;

/**
 * @author sylar
 * @Description: 基础script 模型
 * name -> scriptId：script id
 * value -> Map<String,Object>：script params
 * @date 2019-02-25 11:29
 */
public class ParameterScriptSortModel extends BaseScriptSortModel {

    /**
     * sort parameters map
     */
    private Map<String, Object> parameterMap;

    <T extends ParameterScriptSortModel.BaseScriptSortMemberBuilder<T>> ParameterScriptSortModel(BaseScriptSortMemberBuilder<T> builder) {
        super(builder);
        Assert.checkNull(builder.parameterMap, "BaseScriptSortModel must has one or more parameter, " +
                "if the script doesn't have parameters, you should use NoneParameterScriptModel.");
        this.parameterMap = builder.parameterMap;
    }

    public static BaseScriptSortBuilder newBuilder() {
        return new BaseScriptSortBuilder();
    }

    public static class BaseScriptSortBuilder extends BaseScriptSortMemberBuilder<BaseScriptSortBuilder> {
        private BaseScriptSortBuilder() {
        }
    }

    static class BaseScriptSortMemberBuilder<T extends ParameterScriptSortModel.BaseScriptSortMemberBuilder<T>> extends
            BaseScriptSortModel.BaseScriptSortMemberBuilder<T> {

        private Map<String, Object> parameterMap;

        public T parameter(Map<String, Object> parameterMap) {
            this.parameterMap = parameterMap;
            return (T) this;
        }

        public T parameter(ScriptParamsConverter scriptParamsConverter) {
            Assert.checkNull(scriptParamsConverter, "ScriptParamsConverter must not be null!");
            this.parameterMap = scriptParamsConverter.get();
            return (T) this;
        }

        @Override
        public ParameterScriptSortModel build() {
            return new ParameterScriptSortModel(this);
        }
    }

}
