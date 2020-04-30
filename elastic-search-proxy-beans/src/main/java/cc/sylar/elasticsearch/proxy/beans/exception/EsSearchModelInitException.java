package cc.sylar.elasticsearch.proxy.beans.exception;

/**
 * @author sylar
 * @Description:
 * @date 2018/10/31 2:18 PM
 */
public class EsSearchModelInitException extends EsSearchModelException {
    public EsSearchModelInitException() {
    }

    public EsSearchModelInitException(String message) {
        super(message);
    }

    public EsSearchModelInitException(String message, Throwable cause) {
        super(message, cause);
    }

    public EsSearchModelInitException(Throwable cause) {
        super(cause);
    }
}
