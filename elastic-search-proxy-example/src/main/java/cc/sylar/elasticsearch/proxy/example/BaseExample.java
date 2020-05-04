package cc.sylar.elasticsearch.proxy.example;

import cc.sylar.elasticsearch.proxy.beans.search.request.geo.BaseGeoSearchModel;
import cc.sylar.elasticsearch.proxy.beans.search.request.base.QueryModel;
import cc.sylar.elasticsearch.proxy.beans.search.request.geo.GeoDistance;
import cc.sylar.elasticsearch.proxy.beans.search.request.range.RangeQuery;
import cc.sylar.elasticsearch.proxy.beans.search.request.range.BaseRangeSearchModel;

import java.util.Date;

/**
 * @author sylar
 * @Description:
 * @date 2020/4/30 6:57 下午
 */
public class BaseExample {


    public void baseBuild() {
        QueryModel<Boolean> queryModel  = QueryModel.<Boolean>newBuilder().value(Boolean.TRUE).build();
        BaseGeoSearchModel.newBuilder().field("field").geoDistance(GeoDistance.newBuilder().build()).build();
        BaseRangeSearchModel<Date> baseRangeSearchModel = BaseRangeSearchModel.<Date>newBuilder().
                range(RangeQuery.<Date>newBuilder().build()).build();

    }

}
