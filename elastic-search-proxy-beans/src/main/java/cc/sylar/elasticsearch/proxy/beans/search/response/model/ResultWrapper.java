package cc.sylar.elasticsearch.proxy.beans.search.response.model;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.util.Map;

/**
 * @author sylar
 * @Description:
 * @date 2018/8/24 上午11:54
 */
public class ResultWrapper implements Serializable {
    /**
     * 结果集
     */
    private Map<String,Object> resultMap;

    public ResultWrapper(Map<String, Object> resultMap) {
        this.resultMap = resultMap;
    }

    /**
     * warring: only parallel and base type parameters can be converted
     *          if you want to convert complex structure class, this maybe not work. you should try another approach to convert it
     * @param clazz
     * @param <T>
     * @return
     * @throws InstantiationException
     * @throws IllegalAccessException
     */
    public <T> T parseObject (Class<T> clazz) throws InstantiationException,IllegalAccessException {
        return mapToObject(resultMap, clazz);
    }

    /**
     * get value by key from resultMap
     * return null when the resultMap is null
     * @param key
     * @param <T>
     * @return
     */
    public <T> T get(String key){
        if (resultMap == null) {
            return null;
        }
        return (T) resultMap.get(key);
    }

    /**
     *
     * @param key
     * @param defaultValue
     * @param <T>
     * @return
     */
    public <T> T getOrDefault(String key, T defaultValue){
        if (resultMap == null) {
            return null;
        }
        return (T) resultMap.getOrDefault(key, defaultValue);
    }

    public Map<String, Object> getResultMap() {
        return resultMap;
    }

    public void setResultMap(Map<String, Object> resultMap) {
        this.resultMap = resultMap;
    }

    public static class InitClassException extends RuntimeException {
        public InitClassException(String message,Throwable e) {
            super(message,e);
        }
    }

    public static class MethodAccessException extends RuntimeException {
        public MethodAccessException(String message,Throwable e) {
            super(message,e);
        }
    }

    private static <T> T mapToObject(Map<String, Object> map, Class<T> beanClass) throws InstantiationException, IllegalAccessException {
        if (map == null) {
            return null;
        }
        T obj = beanClass.newInstance();
        Field[] fields = obj.getClass().getDeclaredFields();
        if (fields == null || fields.length == 0) {
            return null;
        }
        for (Field field : fields) {
            int mod = field.getModifiers();
            if(Modifier.isStatic(mod) || Modifier.isFinal(mod)){
                continue;
            }
            Class<?> fieldTypeClass  = field.getType();
            field.setAccessible(true);
            field.set(obj, convertValType(map.get(field.getName()), fieldTypeClass));
        }
        return obj;
    }

    private static Object convertValType(Object value, Class<?> fieldTypeClass) {
        if (value == null) {
            return null;
        }
        if (value.getClass().equals(fieldTypeClass)) {
            return value;
        }
        Object retVal;
        if(Long.class.getName().equals(fieldTypeClass.getName())
                || long.class.getName().equals(fieldTypeClass.getName())) {
            retVal = new BigDecimal(value.toString()).longValue();
        } else if(Integer.class.getName().equals(fieldTypeClass.getName())
                || int.class.getName().equals(fieldTypeClass.getName())) {
            retVal = new BigDecimal(value.toString()).intValue();
        } else if(Float.class.getName().equals(fieldTypeClass.getName())
                || float.class.getName().equals(fieldTypeClass.getName())) {
            retVal = new BigDecimal(value.toString()).floatValue();
        } else if(Double.class.getName().equals(fieldTypeClass.getName())
                || double.class.getName().equals(fieldTypeClass.getName())) {
            retVal = new BigDecimal(value.toString()).doubleValue();
        } else {
            retVal = value;
        }
        return retVal;
    }

    @Override
    public String toString() {
        return "ResultWrapper{" +
                "resultMap=" + resultMap +
                '}';
    }
}
