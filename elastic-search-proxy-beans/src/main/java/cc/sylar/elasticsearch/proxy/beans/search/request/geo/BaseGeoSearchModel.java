package cc.sylar.elasticsearch.proxy.beans.search.request.geo;

import cc.sylar.elasticsearch.proxy.beans.search.request.base.BaseQueryModel;

/**
 * @author sylar
 * @Description: 单点距离过滤
 * @date 2018/10/31 5:15 PM
 */
public class BaseGeoSearchModel extends BaseQueryModel<GeoDistance> {
    private BaseGeoSearchModel(Builder builder) {
        super(builder);
    }

    public GeoDistance getGeoDistance() {
        return super.getValue();
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static final class Builder extends BaseQueryModel.BaseMemberBuilder<Builder, GeoDistance> {
        GeoDistance geoDistance;

        private Builder() { }

        public Builder field(String field) {
            return super.name(field);
        }

        public Builder geoDistance(GeoDistance geoDistance) {
            this.geoDistance = geoDistance;
            return this;
        }

        @Override
        public BaseGeoSearchModel build() {
            return new BaseGeoSearchModel(this);
        }
    }
}
