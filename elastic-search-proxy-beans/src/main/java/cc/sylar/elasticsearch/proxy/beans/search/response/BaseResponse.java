package cc.sylar.elasticsearch.proxy.beans.search.response;

import java.io.Serializable;

/**
 * @author sylar
 * @Description:
 * @date 2018/10/22 5:04 PM
 */
public class BaseResponse<T extends BaseSearchResponse> implements Serializable {
    private Boolean success;
    private Integer code;
    private String message;
    private T result;

    public BaseResponse(){}

    private BaseResponse(Builder<T> builder) {
        setSuccess(builder.success);
        setCode(builder.code);
        setMessage(builder.message);
        setResult(builder.result);
    }

    public static BaseResponse.Builder newBuilder() {
        return new BaseResponse.Builder();
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public static final class Builder<T extends BaseSearchResponse> {
        private Boolean success;
        private Integer code;
        private String message;
        private T result;

        private Builder() {
        }

        public Builder success(Boolean val) {
            success = val;
            return this;
        }

        public Builder code(Integer val) {
            code = val;
            return this;
        }

        public Builder message(String val) {
            message = val;
            return this;
        }

        public Builder result(T val) {
            result = val;
            return this;
        }

        public BaseResponse<T> build() {
            return new BaseResponse(this);
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
