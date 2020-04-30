package cc.sylar.elasticsearch.proxy.beans.search.request.base.score;

import cc.sylar.elasticsearch.proxy.beans.search.request.base.BaseSearchModel;

/**
 * @author sylar
 * @Description:
 * @date 2020/4/28 11:27 下午
 */
public class NoneParameterScriptScoreModel extends BaseSearchModel<Void> {

    public NoneParameterScriptScoreModel(Builder builder) {
        super(builder);
    }

    public static class Builder extends BaseSearchModel.Builder<NoneParameterScriptScoreModel.Builder, Void> {

        @Override
        public Builder value(Void val) {
            return this;
        }
    }
}
