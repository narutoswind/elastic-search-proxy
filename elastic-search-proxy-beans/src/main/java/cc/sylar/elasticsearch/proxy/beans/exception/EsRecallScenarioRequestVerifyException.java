package cc.sylar.elasticsearch.proxy.beans.exception;

/**
 * @author xudong.wang
 * @email xudong.wang@ymm56.com
 * @time 2019-04-08
 * @description
 */
public class EsRecallScenarioRequestVerifyException extends EsProxyException {

    public EsRecallScenarioRequestVerifyException() {
    }

    public EsRecallScenarioRequestVerifyException(String message) {
        super(message);
    }

    public EsRecallScenarioRequestVerifyException(String message, Throwable cause) {
        super(message, cause);
    }

    public EsRecallScenarioRequestVerifyException(Throwable cause) {
        super(cause);
    }

}
