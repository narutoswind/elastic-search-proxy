package cc.sylar.elasticsearch.proxy.beans.search.request.base.source;

import cc.sylar.elasticsearch.proxy.beans.search.request.fuction.FieldGetter;
import cc.sylar.elasticsearch.proxy.beans.search.request.base.BaseQueryModel;

/**
 * @author sylar
 * @Description:
 * @date 2019-04-09 09:57
 */
public abstract class BaseSourceModel<V> extends BaseQueryModel<V> implements FieldGetter {

    <T extends BaseMemberBuilder> BaseSourceModel(BaseMemberBuilder<T, V> builder) {
        super(builder);
    }

    @Override
    public String getField() {
        return super.getName();
    }
}
