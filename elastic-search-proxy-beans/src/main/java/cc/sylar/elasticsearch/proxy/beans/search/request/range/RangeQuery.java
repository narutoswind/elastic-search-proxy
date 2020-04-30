package cc.sylar.elasticsearch.proxy.beans.search.request.range;

import java.io.Serializable;

/**
 * @author sylar
 * @Description: 区间查询组装类
 * @date 2018/8/27 下午3:17
 */
public class RangeQuery<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 左闭区间
     */
    private T gteFrom;

    /**
     * 左开区间
     */
    private T gtFrom;

    /**
     * 右闭区间
     */
    private T lteTo;

    /**
     * 右开区间
     */
    private T ltTo;

    public RangeQuery() {
    }

    private RangeQuery(Builder<T> builder) {
        setGteFrom(builder.gteFrom);
        setGtFrom(builder.gtFrom);
        setLteTo(builder.lteTo);
        setLtTo(builder.ltTo);
    }

    public static <T> Builder<T> newBuilder() {
        return new <T>Builder();
    }

    public T getGteFrom() {
        return gteFrom;
    }

    public void setGteFrom(T gteFrom) {
        this.gteFrom = gteFrom;
    }

    public T getGtFrom() {
        return gtFrom;
    }

    public void setGtFrom(T gtFrom) {
        this.gtFrom = gtFrom;
    }

    public T getLteTo() {
        return lteTo;
    }

    public void setLteTo(T lteTo) {
        this.lteTo = lteTo;
    }

    public T getLtTo() {
        return ltTo;
    }

    public void setLtTo(T ltTo) {
        this.ltTo = ltTo;
    }

    public boolean isEmptyValue() {
        return getGteFrom() == null && getGtFrom() == null && getLteTo() == null && getLtTo() == null;
    }

    public static final class Builder<T> {
        private T gteFrom;
        private T gtFrom;
        private T lteTo;
        private T ltTo;

        public Builder() {
        }

        public Builder gteFrom(T val) {
            gteFrom = val;
            return this;
        }

        public Builder gtFrom(T val) {
            gtFrom = val;
            return this;
        }

        public Builder lteTo(T val) {
            lteTo = val;
            return this;
        }

        public Builder ltTo(T val) {
            ltTo = val;
            return this;
        }

        public RangeQuery<T> build() {
            return new RangeQuery(this);
        }
    }

    @Override
    public String toString() {
        return "RangeQueryKey{" +
                "gteFrom=" + gteFrom +
                ", gtFrom=" + gtFrom +
                ", lteTo=" + lteTo +
                ", ltTo=" + ltTo +
                '}';
    }
}
