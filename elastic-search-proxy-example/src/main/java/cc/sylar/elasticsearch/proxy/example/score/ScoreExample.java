package cc.sylar.elasticsearch.proxy.example.score;

import cc.sylar.elasticsearch.proxy.beans.common.ScriptParamsConverter;
import cc.sylar.elasticsearch.proxy.beans.search.request.base.score.NoneParameterScriptScoreModel;
import cc.sylar.elasticsearch.proxy.beans.search.request.base.score.ParameterScriptScoreModel;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sylar
 * @Description:
 * @date 2020/5/4 7:09 下午
 */
public class ScoreExample {

    public void build() {

        /**
         * none parameters score script
         */
        NoneParameterScriptScoreModel noneParameterScriptScoreModel = NoneParameterScriptScoreModel.newBuilder()
                .scriptId("scriptId").build();

        /**
         *
         */
        ParameterScriptScoreModel parameterScriptScoreModel = ParameterScriptScoreModel.newBuilder().scriptId("scriptId")
                .parameter(new HashMap<>()).build();


        ParameterScriptScoreModel parameterScriptScoreModel1 = ParameterScriptScoreModel.newBuilder().scriptId("scriptId")
                .parameter(new ScriptParamsConverter() {
                    @Override
                    public Map<String, Object> get() {
                        return null;
                    }
                }).build();
    }
}
