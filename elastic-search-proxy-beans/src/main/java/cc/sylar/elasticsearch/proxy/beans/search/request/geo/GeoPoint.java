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

    public GeoPoint(){}

    public GeoPoint(Double lon, Double lat) {
        this.lon = lon;
        this.lat = lat;
    }

    private GeoPoint(Builder builder) {
        setLon(builder.lon);
        setLat(builder.lat);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
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
