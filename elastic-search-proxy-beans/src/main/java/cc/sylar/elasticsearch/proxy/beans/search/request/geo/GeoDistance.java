package cc.sylar.elasticsearch.proxy.beans.search.request.geo;

/**
 * @author sylar
 * @Description:
 * @date 2020/5/2 12:43 下午
 */
public class GeoDistance {
    /**
     * 查询坐标点
     */
    private GeoPoint geoPoint;
    /**
     * 查询距离
     * example：15km
     * this is should be distance number and unit
     * unit：mi(mile) yd(yard) ft(feet) in(inch) km(kilometer) m(meter) cm(centimeter) mm(millimeter) nmi(nautical mile)
     */
    private String distance;

    private GeoDistance(Builder builder) {
        geoPoint = builder.geoPoint;
        distance = builder.distance;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static final class Builder {
        private GeoPoint geoPoint;
        private String distance;

        private Builder() {
        }

        public Builder geoPoint(GeoPoint val) {
            geoPoint = val;
            return this;
        }

        public Builder distance(String val) {
            distance = val;
            return this;
        }

        public GeoDistance build() {
            return new GeoDistance(this);
        }
    }

    @Override
    public String toString() {
        return "GeoDistance{" +
                "geoPoint=" + geoPoint +
                ", distance='" + distance + '\'' +
                '}';
    }
}
