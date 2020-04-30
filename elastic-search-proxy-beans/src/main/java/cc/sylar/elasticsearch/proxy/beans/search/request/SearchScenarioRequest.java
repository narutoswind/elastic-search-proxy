package cc.sylar.elasticsearch.proxy.beans.search.request;

import cc.sylar.elasticsearch.proxy.beans.common.Scenario;

import java.io.Serializable;

/**
 * @author sylar
 * @Description:
 * @date 2018/12/4 8:31 PM
 */
public class SearchScenarioRequest implements Serializable {

    private Scenario scenario;

    private BaseSearchRequest request;

    public SearchScenarioRequest(Scenario scenario, BaseSearchRequest request) {
        this.scenario = scenario;
        this.request = request;
    }

    public Scenario getScenario() {
        return scenario;
    }

    public void setScenario(Scenario scenario) {
        this.scenario = scenario;
    }

    public BaseSearchRequest getRequest() {
        return request;
    }

    public void setRequest(BaseSearchRequest request) {
        this.request = request;
    }

    @Override
    public String toString() {
        return "SearchScenarioRequest{" +
                "scenario=" + scenario +
                ", request=" + request +
                '}';
    }
}
