package cc.sylar.elasticsearch.proxy.beans.common;

/**
 * @author sylar
 * @Description:
 * @date 2020/4/27 11:52 下午
 */
public class Scenario {
    /**
     *
     */
    private String domain;
    /**
     * 场景名称
     *
     */
    private String scenario;

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getScenario() {
        return scenario;
    }

    public void setScenario(String scenario) {
        this.scenario = scenario;
    }

    @Override
    public String toString() {
        return "Scenario{" +
                "domain='" + domain + '\'' +
                ", scenario='" + scenario + '\'' +
                '}';
    }
}
