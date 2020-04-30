package cc.sylar.elasticsearch.proxy.beans.search.request.base.score;

import cc.sylar.elasticsearch.proxy.beans.search.request.base.BaseSearchModel;

/**
 * @author sylar
 * @Description:
 * @date 2020/4/28 11:26 下午
 */
public abstract class BaseScoreModel<V> extends BaseSearchModel<V> {

    public BaseScoreModel(Builder<?, V> builder) {
        super(builder);
    }

}
