package cc.sylar.elasticsearch.proxy.beans.search.request.base.sort;

import java.util.Map;

/**
 * @author sylar
 * @Description: 基础script 模型
 * name -> scriptId：script id
 * value -> Map<String,Object>：script params
 * @date 2019-02-25 11:29
 */
public class ScriptSortModel extends BaseSortModel<Map<String, Object>> {

    private ScriptSortModel(Builder builder) {
        super(builder);
    }

    public static final class Builder<T extends ScriptSortModel.Builder<T>> extends BaseSortModel.Builder<T, Map<String, Object>> {

        @Override
        public ScriptSortModel build() {
            return new ScriptSortModel(this);
        }
    }
}
