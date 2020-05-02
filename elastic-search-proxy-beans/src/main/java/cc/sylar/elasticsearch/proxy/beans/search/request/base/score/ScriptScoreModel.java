package cc.sylar.elasticsearch.proxy.beans.search.request.base.score;

import java.util.Map;

/**
 * @author sylar
 * @Description: 基础script score模型
 *               scriptId -> scriptId：script id
 *               paramMap -> Map<String,Object>：script params
 * @date 2019-02-25 15:32
 */
public class ScriptScoreModel extends BaseScoreModel<Map<String, Object>> {

    private ScriptScoreModel(Builder<Map<String, Object>> builder) {
        super(builder);
    }
}
