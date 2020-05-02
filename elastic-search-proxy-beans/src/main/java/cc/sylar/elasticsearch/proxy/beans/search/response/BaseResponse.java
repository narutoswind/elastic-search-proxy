package cc.sylar.elasticsearch.proxy.beans.search.response;

import java.io.Serializable;

/**
 * @author sylar
 * @Description:
 * @date 2018/10/22 5:04 PM
 */
public class BaseResponse<T> implements Serializable {
    private boolean success;
    private Integer code;
    private String message;
    private T result;

    private BaseResponse(Builder<T> builder) {
        this.success = builder.success;
        this.code = builder.code;
        this.message = builder.message;
        this.result = builder.result;
    }

    public static BaseResponse.Builder newBuilder() {
        return new BaseResponse.Builder();
    }

    public boolean isSuccess() {
        return success;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public T getResult() {
        return result;
    }

    public static final class Builder<T> {
        private boolean success;
        private Integer code;
        private String message;
        private T result;

        private Builder() {
        }

        public Builder success(boolean success) {
            this.success = success;
            return this;
        }

        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public Builder result(T result) {
            this.result = result;
            return this;
        }

        public BaseResponse<T> build() {
            return new BaseResponse<>(this);
        }
    }

    @Override
    public String toString() {
        return "BaseResponse{" +
                "success=" + success +
                ", code=" + code +
                ", message='" + message + '\'' +
                ", result=" + result +
                '}';
    }
}
