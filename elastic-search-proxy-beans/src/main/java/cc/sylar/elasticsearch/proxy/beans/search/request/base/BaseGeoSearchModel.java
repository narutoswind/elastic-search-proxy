package cc.sylar.elasticsearch.proxy.beans.search.request.base;

import cc.sylar.elasticsearch.proxy.beans.search.request.geo.GeoDistance;

import java.util.Objects;

/**
 * @author sylar
 * @Description: 单点距离过滤
 * @date 2018/10/31 5:15 PM
 */
public class BaseGeoSearchModel extends BaseQueryModel<GeoDistance> {

    private GeoDistance geoDistance;


    private <T extends Builder> BaseGeoSearchModel(Builder<T> builder) {
        super(builder);
    }

    public GeoDistance getGeoDistance() {
        return geoDistance;
    }

    public static BaseGeoSearchModel.Builder newBuilder() {
        return new BaseGeoSearchModel.Builder();
    }

    public static class Builder<T extends Builder> extends MemberBuilder<T, GeoDistance>{
        GeoDistance geoDistance;

        Builder geoDistance(GeoDistance geoDistance) {
            this.geoDistance = geoDistance;
            return this;
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BaseGeoSearchModel)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        BaseGeoSearchModel that = (BaseGeoSearchModel) o;
        return geoDistance.equals(that.geoDistance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), geoDistance);
    }
}
