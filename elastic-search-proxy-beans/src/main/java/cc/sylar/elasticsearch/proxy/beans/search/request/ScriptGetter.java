package cc.sylar.elasticsearch.proxy.beans.search.request;

/**
 * @author sylar
 * @Description:
 * @date 2020/5/4 10:16 下午
 */
public interface ScriptGetter<T> {
    /**
     * get script id
     * @return
     */
    String getScriptId();

    /**
     * get script parameters
     * @return
     */
    default T getScriptParameters() {
        return null;
    }
}
