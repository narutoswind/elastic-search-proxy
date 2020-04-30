package cc.sylar.elasticsearch.proxy.beans.exception;

/**
 * @author sylar
 * @Description:
 * @date 2018/10/31 2:17 PM
 */
public class EsSearchModelException extends EsProxyException {
    public EsSearchModelException() {
    }

    public EsSearchModelException(String message) {
        super(message);
    }

    public EsSearchModelException(String message, Throwable cause) {
        super(message, cause);
    }

    public EsSearchModelException(Throwable cause) {
        super(cause);
    }
}
