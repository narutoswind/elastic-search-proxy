package cc.sylar.elasticsearch.proxy.beans.context;

import cc.sylar.elasticsearch.proxy.beans.search.request.BaseSearchRequest;
import com.sun.tools.javac.util.Assert;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author sylar
 * @Description:
 * @date 2020/5/2 10:33 上午
 */
public class SearchContext {

    private final BaseSearchRequest searchRequest;

    private Map<String, Object> attributes = new ConcurrentHashMap<>();

    public SearchContext(BaseSearchRequest request) {
        Assert.checkNull(request, "'request' is required");
        this.searchRequest = request;
    }

    public BaseSearchRequest getSearchRequest() {
        return searchRequest;
    }

    public Map<String, Object> getAttributes() {
        return attributes;
    }

    /**
     *
     * @param key
     * @param <T>
     * @return
     */
    public <T> T getAttribute(String key) {
        return (T) attributes.get(key);
    }

    /**
     *
     * @param key
     * @param <T>
     * @return
     */
    public <T> T getRequiredAttribute(String key) {
        T value = (T) attributes.get(key);
        Assert.checkNull(value);
        return value;
    }

    /**
     *
     * @param key
     * @param defaultValue
     * @param <T>
     * @return
     */
    public <T> T getAttributeOrDefault(String key, T defaultValue) {
        return (T) attributes.getOrDefault(key, defaultValue);
    }

}
