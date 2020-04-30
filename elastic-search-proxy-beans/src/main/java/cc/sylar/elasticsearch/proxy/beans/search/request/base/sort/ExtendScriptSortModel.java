package cc.sylar.elasticsearch.proxy.beans.search.request.base.sort;

import cc.sylar.elasticsearch.proxy.beans.common.ScriptParamsConverter;

/**
 * @author sylar
 * @Description:
 * @date 2020/4/29 11:57 下午
 */
public class ExtendScriptSortModel extends BaseSortModel<ScriptParamsConverter> {

    public ExtendScriptSortModel(Builder builder) {
        super(new ScriptSortModel.Builder<>().sortModel(builder.sortModel).name(builder.name).value(builder.value.get()));
    }

    public static final class Builder extends BaseSortModel.Builder<ExtendScriptSortModel.Builder, ScriptParamsConverter> {

        @Override
        public ExtendScriptSortModel build() {
            return new ExtendScriptSortModel(this);
        }
    }
}
