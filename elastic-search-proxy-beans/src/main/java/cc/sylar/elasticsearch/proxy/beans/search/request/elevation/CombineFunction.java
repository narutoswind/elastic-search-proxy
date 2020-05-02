package cc.sylar.elasticsearch.proxy.beans.search.request.elevation;

import java.util.Locale;

/**
 *
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
