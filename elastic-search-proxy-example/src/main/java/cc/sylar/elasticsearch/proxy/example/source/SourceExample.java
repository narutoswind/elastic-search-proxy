package cc.sylar.elasticsearch.proxy.example.source;

import cc.sylar.elasticsearch.proxy.beans.common.ScriptParamsConverter;
import cc.sylar.elasticsearch.proxy.beans.search.request.base.source.FiledSourceModel;
import cc.sylar.elasticsearch.proxy.beans.search.request.base.source.NoneParameterScriptSourceModel;
import cc.sylar.elasticsearch.proxy.beans.search.request.base.source.ParameterScriptSourceModel;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sylar
 * @Description:
 * @date 2020/5/2 1:17 下午
 */
public class SourceExample {


    public void sourceBuild() {
        /**
         * field source
         */
        FiledSourceModel filedSourceModel = FiledSourceModel.newBuilder().field("fieldName").build();
        /**
         *
         */
        NoneParameterScriptSourceModel noneParameterScriptSourceModel = NoneParameterScriptSourceModel.newBuilder().
                field("field").scriptId("scriptId").build();
        /**
         *
         */
        ParameterScriptSourceModel parameterScriptSourceModel = ParameterScriptSourceModel.newBuilder().field("field")
                .scriptId("scriptId").parameter(new HashMap<>()).build();
        /**
         *
         */
        ParameterScriptSourceModel parameterScriptSourceModel1 = ParameterScriptSourceModel.newBuilder().field("field")
                .scriptId("scriptId").parameter(new ScriptParamsConverter() {
                    @Override
                    public Map<String, Object> get() {
                        return new HashMap<>();
                    }
                }).build();
    }
}