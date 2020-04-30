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
 * @date 2020/4/30 6:57 下午
 */
public class Test {


    public static void main(String[] args) {
        FiledSortModel filedSortModel = FiledSortModel.newBuilder().field("field").sortModel(SortModel.ASC).build();
        NoneParameterScriptModel noneParameterScriptModel = NoneParameterScriptModel.newBuilder().scriptId("id").
                sortModel(SortModel.ASC).build();
        ParameterScriptSortModel baseScriptSortModel = ParameterScriptSortModel.newBuilder().scriptId("id").
                parameter(new HashMap<>()).sortModel(SortModel.ASC).build();
        ParameterScriptSortModel baseScriptSortModel1 = ParameterScriptSortModel.newBuilder().scriptId("id").
                parameter(new ScriptParamsConverter() {
                    @Override
                    public Map<String, Object> get() {
                        return new HashMap<>();
                    }
                }).sortModel(SortModel.ASC).build();

    }
}
