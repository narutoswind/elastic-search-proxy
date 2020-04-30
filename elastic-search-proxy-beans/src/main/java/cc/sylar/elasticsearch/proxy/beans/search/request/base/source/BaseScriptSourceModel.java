package cc.sylar.elasticsearch.proxy.beans.search.request.base.source;

import cc.sylar.elasticsearch.proxy.beans.search.request.base.BaseSearchModel;
import cc.sylar.elasticsearch.proxy.beans.search.request.base.score.ScriptScoreModel;

import java.util.Map;

/**
 * @author sylar
 * @Description:
 * @date 2019-04-09 09:58
 */
public class BaseScriptSourceModel extends BaseSearchModel<Map<String, Object>> {

    private BaseScriptSourceModel(ScriptScoreModel.Builder builder) {
        super(builder);
    }
}
