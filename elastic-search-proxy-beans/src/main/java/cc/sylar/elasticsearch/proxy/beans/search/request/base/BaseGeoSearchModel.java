package cc.sylar.elasticsearch.proxy.beans.search.request.base;

import cc.sylar.elasticsearch.proxy.beans.search.request.geo.GeoPoint;

import java.util.Objects;

/**
 * @author sylar
 * @Description: 单点距离过滤
 * @date 2018/10/31 5:15 PM
 */
public class BaseGeoSearchModel extends AbstractSearchModel {
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

    public BaseGeoSearchModel(String name) {
        super(name);
    }

    public GeoPoint getGeoPoint() {
        return geoPoint;
    }

    public void setGeoPoint(GeoPoint geoPoint) {
        this.geoPoint = geoPoint;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    private BaseGeoSearchModel(BaseGeoSearchModel.Builder builder) {
        super(builder.name);
        setDistance(builder.distance);
        setGeoPoint(builder.geoPoint);
        setInnerSearchModel(builder.innerSearchModel);
    }

    public static <T extends Builder>BaseGeoSearchModel.Builder newBuilder() {
        return new BaseGeoSearchModel.Builder();
    }

    public static class Builder<T extends Builder> {
        private String name;
        private GeoPoint geoPoint;
        private String distance;
        private InnerSearchModel innerSearchModel;

        protected Builder() {
        }

        public T name(String val) {
            name = val;
            return self();
        }

        public T geoPoint(GeoPoint val) {
            geoPoint = val;
            return self();
        }

        public T distance(String val) {
            distance = val;
            return self();
        }

        public T innerSearchModel(InnerSearchModel val){
            innerSearchModel = val;
            return self();
        }

        /**
         * 子类应该复写此方法，返回自身 builder 实例
         * @return
         */
        protected T self() {
            return (T) this;
        }
        /**
         * 子类应该复写此方法，返回自身构造
         * @return
         */
        public BaseGeoSearchModel build() {
            return new BaseGeoSearchModel(this);
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
        BaseGeoSearchModel that = (BaseGeoSearchModel) o;
        return Objects.equals(geoPoint, that.geoPoint)&&
                Objects.equals(distance, that.distance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(geoPoint, distance);
    }

    @Override
    public String toString() {
        return "BaseGeoSearchModel{" +
                "geoPoint=" + geoPoint +
                ", distance='" + distance + '\'' +
                "} " + super.toString();
    }
}
