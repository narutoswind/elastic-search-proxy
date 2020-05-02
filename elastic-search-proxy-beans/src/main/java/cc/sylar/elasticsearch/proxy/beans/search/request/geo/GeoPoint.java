package cc.sylar.elasticsearch.proxy.beans.search.request.geo;

import java.io.Serializable;

/**
 * @author sylar
 * @Description:
 * @date 2018/10/30 3:17 PM
 */
public class GeoPoint implements Serializable {
    /**
     * 经度
     */
    private Double lon;
    /**
     * 纬度
     */
    private Double lat;

    private GeoPoint(Builder builder) {
        this.lon = builder.lon;
        this.lat = builder.lat;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Double getLon() {
        return lon;
    }

    public Double getLat() {
        return lat;
    }

    public static final class Builder {
        private Double lon;
        private Double lat;

        private Builder() {
        }

        public Builder lon(Double val) {
            lon = val;
            return this;
        }

        public Builder lat(Double val) {
            lat = val;
            return this;
        }

        public GeoPoint build() {
            return new GeoPoint(this);
        }
    }

    @Override
    public String toString() {
        return "GeoPoint{" +
                "lon=" + lon +
                ", lat=" + lat +
                '}';
    }
}
