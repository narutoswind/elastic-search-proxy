package cc.sylar.elasticsearch.proxy.beans.exception;

import java.io.Serializable;

/**
 * @author sylar
 * @Description:
 * @date 2018/10/24 3:16 PM
 */
public class EsProxyException extends RuntimeException implements Serializable {

    public EsProxyException() {
    }

    public EsProxyException(String message) {
        super(message);
    }

    public EsProxyException(String message, Throwable cause) {
        super(message, cause);
    }

    public EsProxyException(Throwable cause) {
        super(cause);
    }

}
