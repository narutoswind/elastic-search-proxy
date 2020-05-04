package cc.sylar.elasticsearch.proxy.beans.search.request;

import cc.sylar.elasticsearch.proxy.beans.common.ScriptParamsConverter;
import com.sun.tools.javac.util.Assert;

import java.util.Map;

/**
 * @author sylar
 * @Description:
 * @date 2020/5/4 11:08 下午
 */
public interface ScriptSetter {

    /**
     *
     * @param parameterMap
     * @return
     */
    ScriptSetter parameter(Map<String, Object> parameterMap);

    /**
     *
     * @param scriptParamsConverter
     * @return
     */
    default ScriptSetter parameter(ScriptParamsConverter scriptParamsConverter) {
        Assert.checkNonNull(scriptParamsConverter, "ScriptParamsConverter must not be null!");
        return this.parameter(scriptParamsConverter.get());
    }
}
