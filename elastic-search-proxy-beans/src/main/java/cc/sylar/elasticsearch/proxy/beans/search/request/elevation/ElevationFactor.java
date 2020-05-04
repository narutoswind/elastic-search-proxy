package cc.sylar.elasticsearch.proxy.beans.search.request.elevation;

import cc.sylar.elasticsearch.proxy.beans.search.request.search.SearchModelBuilder;
import cc.sylar.elasticsearch.proxy.beans.search.request.base.AbstractSearchModel;
import cc.sylar.elasticsearch.proxy.beans.search.request.base.score.ParameterScriptScoreModel;

import java.io.Serializable;
import java.util.Map;

/**
 * @author sylar
 * @Description
 * @date  2019-02-19
 */
public class ElevationFactor implements Serializable {
    /**
     * script score should use BaseScriptScoreModel
     * @see ParameterScriptScoreModel
     * filter query boost use AbstractSearchModel
     * @see AbstractSearchModel
     */
    private Map<AbstractSearchModel, Double> queryElevationModel;

    /**
     * combination query, support must must_not should query
     */
    private Map<SearchModelBuilder, Double> combinationElevationModel;

    /**
     * multiply scores are multiplied (default)
     * sum scores are summed
     * avg scores are averaged
     * max maximum score is used
     * min minimum score is used
     */
    private String scoreMode;

    private String boostMode;


    public ElevationFactor(Map<SearchModelBuilder, Double> combinationElevationModel, CombineFunction scoreMode) {
        this.combinationElevationModel = combinationElevationModel;
        this.scoreMode = scoreMode.name();
    }


    public ElevationFactor(Map<AbstractSearchModel, Double> queryElevationModel, Map<SearchModelBuilder, Double> combinationElevationModel, String scoreMode, String boostMode) {
        this.queryElevationModel = queryElevationModel;
        this.combinationElevationModel = combinationElevationModel;
        this.scoreMode = scoreMode;
        this.boostMode = boostMode;
    }

    public ElevationFactor(Map<AbstractSearchModel, Double> queryElevationModel, String scoreMode, String boostMode) {
        this.queryElevationModel = queryElevationModel;
        this.scoreMode = scoreMode;
        this.boostMode = boostMode;
    }

    public ElevationFactor(Map<AbstractSearchModel, Double> elevationModel, CombineFunction scoreMode, CombineFunction boostMode) {
        this.elevationModel = elevationModel;
        this.scoreMode = scoreMode.name();
        this.boostMode = boostMode.name();
    }

    public ElevationFactor() {
    }

    public boolean isEmptyModel() {
        return elevationModel == null || elevationModel.isEmpty();
    }

    public boolean isEmptyCombinationElevationModel() {
        return combinationElevationModel == null || combinationElevationModel.isEmpty();
    }

    public Map<AbstractSearchModel, Double> getElevationModel() {
        return elevationModel;
    }

    public String getScoreMode() {
        return scoreMode;
    }

    public String getBoostMode() {
        return boostMode;
    }

    public void setBoostMode(String boostMode) {
        this.boostMode = boostMode;
    }

    public Map<SearchModelBuilder, Double> getCombinationElevationModel() {
        return combinationElevationModel;
    }

    public void setCombinationElevationModel(Map<SearchModelBuilder, Double> combinationElevationModel) {
        this.combinationElevationModel = combinationElevationModel;
    }

    @Override
    public String toString() {
        return "ElevationFactor{" +
                "elevationModel=" + elevationModel +
                ", combinationElevationModel=" + combinationElevationModel +
                ", scoreMode='" + scoreMode + '\'' +
                ", boostMode='" + boostMode + '\'' +
                '}';
    }
}
