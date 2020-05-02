package cc.sylar.elasticsearch.proxy.example.sort;

import cc.sylar.elasticsearch.proxy.beans.common.ScriptParamsConverter;
import cc.sylar.elasticsearch.proxy.beans.search.request.base.sort.FiledSortModel;
import cc.sylar.elasticsearch.proxy.beans.search.request.base.sort.NoneParameterScriptModel;
import cc.sylar.elasticsearch.proxy.beans.search.request.base.sort.ParameterScriptSortModel;
import cc.sylar.elasticsearch.proxy.beans.search.request.base.sort.SortModel;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sylar
 * @Description:
 * @date 2020/5/2 9:18 上午
 */
public class SortExample {

    public void exampleBuild() {
        /**
         * sort by mapping field
         */
        FiledSortModel filedSortModel = FiledSortModel.newBuilder().field("field").sortModel(SortModel.ASC).build();
        /**
         * sort by script witch must stored in es cluster
         */
        /**
         * none parameters sort script
         */
        NoneParameterScriptModel noneParameterScriptModel = NoneParameterScriptModel.newBuilder().scriptId("id").
                sortModel(SortModel.ASC).build();
        /**
         * sort script with parameters, the parameters must be encapsulated with map<String,Object>
         */
        ParameterScriptSortModel baseScriptSortModel1 = ParameterScriptSortModel.newBuilder().scriptId("id").
                parameter(new HashMap<String, Object>(8)).sortModel(SortModel.ASC).build();
        /**
         * sort script with ScriptParamsConverter, any custom object witch must be implement ScriptParamsConverter, to be converted a map
         * @see ScriptParamsConverter
         */
        ParameterScriptSortModel baseScriptSortModel2 = ParameterScriptSortModel.newBuilder().scriptId("id").
                parameter(new ScriptParamsConverter() {
                    @Override
                    public Map<String, Object> get() {
                        return new HashMap<>();
                    }
                }).sortModel(SortModel.ASC).build();
    }
}
