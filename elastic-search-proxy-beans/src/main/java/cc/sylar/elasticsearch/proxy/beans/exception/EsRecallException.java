package cc.sylar.elasticsearch.proxy.beans.exception;

/***
 * A recall Exception
 * @author mumuf
 */
public class EsRecallException extends EsProxyException {
    public EsRecallException(){

    }

    /**
     * A constructor of Exception with parameter
     * @param message exception content
     */
    public EsRecallException(String message) {
        super(message);
    }

}
