package cc.sylar.elasticsearch.proxy.beans.search.request.elevation;

import java.util.Locale;

/**
 * @author xudong.wang
 * @email xudong.wang@ymm56.com
 * @time 2019-02-24
 * @description
 */
public enum CombineFunction {

    MULTIPLY,
    REPLACE,
    SUM,
    AVG,
    MIN,
    MAX;

    public static CombineFunction fromString(String combineFunction) {
        return valueOf(combineFunction.toUpperCase(Locale.ROOT));
    }
}
