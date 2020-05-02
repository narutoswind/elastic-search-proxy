package cc.sylar.elasticsearch.proxy.beans.search.request.base.score;

import cc.sylar.elasticsearch.proxy.beans.search.request.base.BaseQueryModel;

/**
 * @author sylar
 * @Description: 评分脚本，主要用于文档提权，需要评分脚本时查询由filter转为query
 * @date 2020/4/28 11:26 下午
 */
public abstract class BaseScoreModel<V> extends BaseQueryModel<V> {

    public BaseScoreModel(Builder<V> builder) {
        super(builder);
    }

}
