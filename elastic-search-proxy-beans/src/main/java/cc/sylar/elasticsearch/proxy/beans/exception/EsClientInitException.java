package cc.sylar.elasticsearch.proxy.beans.exception;

/**
 * @author sylar
 * @Description:
 * @date 2020/4/27 10:50 下午
 */
public class EsClientInitException extends EsProxyException {
    public EsClientInitException() {
    }

    public EsClientInitException(String message) {
        super(message);
    }

    public EsClientInitException(String message, Throwable cause) {
        super(message, cause);
    }

    public EsClientInitException(Throwable cause) {
        super(cause);
    }
}
