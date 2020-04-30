package cc.sylar.elasticsearch.proxy.beans.search.request;

import cc.sylar.elasticsearch.proxy.beans.common.Scenario;

import java.io.Serializable;
import java.util.List;

/**
 * @author sylar
 * @Description:
 * @date 2018/12/4 8:34 PM
 */
public class MultiSearchScenarioRequest implements Serializable {

    private Scenario scenario;
    /**
     * multi search request
     */
    private List<BaseSearchRequest> requestList;

    public MultiSearchScenarioRequest(Scenario scenario, List<BaseSearchRequest> requestList) {
        this.scenario = scenario;
        this.requestList = requestList;
    }

    public Scenario getScenario() {
        return scenario;
    }

    public void setScenario(Scenario scenario) {
        this.scenario = scenario;
    }

    public List<BaseSearchRequest> getRequestList() {
        return requestList;
    }

    public void setRequestList(List<BaseSearchRequest> requestList) {
        this.requestList = requestList;
    }

    @Override
    public String toString() {
        return "MultiSearchScenarioRequest{" +
                "scenario=" + scenario +
                ", requestList=" + requestList +
                '}';
    }
}
