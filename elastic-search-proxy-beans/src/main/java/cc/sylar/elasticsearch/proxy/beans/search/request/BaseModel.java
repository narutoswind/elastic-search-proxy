package cc.sylar.elasticsearch.proxy.beans.search.request;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author sylar
 * @Description:
 * @date 2020/4/27 11:59 下午
 */
public class BaseModel implements Serializable {
    /**
     * name of es mapping filed or script id
     */
    private String name;

    public BaseModel(String name) {
        Objects.requireNonNull(name, "illegal (field name/script id) for construct initializing, (field name/script id) can't be null");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BaseModel)) {
            return false;
        }
        BaseModel baseModel = (BaseModel) o;
        return Objects.equals(name, baseModel.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "BaseModel{" +
                "name='" + name + '\'' +
                '}';
    }
}
