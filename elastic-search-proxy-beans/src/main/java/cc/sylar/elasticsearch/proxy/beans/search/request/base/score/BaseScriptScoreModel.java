package cc.sylar.elasticsearch.proxy.beans.search.request.base.score;

import cc.sylar.elasticsearch.proxy.beans.search.request.ScriptGetter;
import cc.sylar.elasticsearch.proxy.beans.search.request.base.BaseQueryModel;

/**
 * @author sylar
 * @Description: 评分脚本，主要用于文档提权，需要评分脚本时查询由filter转为query
 * @date 2020/4/28 11:26 下午
 */
abstract class BaseScriptScoreModel<V> extends BaseQueryModel<V> implements ScriptGetter<V> {

    <T extends BaseScoreMemberBuilder<T, V>> BaseScriptScoreModel(BaseScoreMemberBuilder<T, V> builder) {
        super(builder);
    }

    @Override
    public String getScriptId() {
        return super.getName();
    }

    static abstract class BaseScoreMemberBuilder<T extends BaseScoreMemberBuilder<T, V>, V> extends
            BaseQueryModel.BaseMemberBuilder<T, V>{

        public T scriptId(String scriptId) {
            super.name(scriptId);
            return self();
        }

        /**
         * 构建具体BaseScriptScoreModel的子类实例
         * @return
         */
        @Override
        public abstract BaseScriptScoreModel build();
    }

}
