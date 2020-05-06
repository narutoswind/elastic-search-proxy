package cc.sylar.elasticsearch.proxy.beans.search.request.elevation;

import cc.sylar.elasticsearch.proxy.beans.search.request.QueryModelBuilder;
import cc.sylar.elasticsearch.proxy.beans.search.request.base.score.BaseScriptScoreModel;

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
     * @see BaseScriptScoreModel
     */
    private Map<BaseScriptScoreModel, Double> scoreElevationModel;
    /**
     * filter query boost use QueryModelBuilder
     * @see QueryModelBuilder
     */
    private Map<QueryModelBuilder, Double> queryElevationModel;

    /**
     * combination query, support and not or query
     */
    private Map<QueryModelBuilder, Double> combinationElevationModel;

    /**
     * multiply scores are multiplied (default)
     * sum scores are summed
     * avg scores are averaged
     * max maximum score is used
     * min minimum score is used
     */
    private String scoreMode;

    private String boostMode;

    private ElevationFactor(Builder builder) {
        scoreElevationModel = builder.scoreElevationModel;
        queryElevationModel = builder.queryElevationModel;
        combinationElevationModel = builder.combinationElevationModel;
        scoreMode = builder.scoreMode;
        boostMode = builder.boostMode;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public boolean isEmptyModel() {
        return (queryElevationModel == null || queryElevationModel.isEmpty())
                && (scoreElevationModel == null || scoreElevationModel.isEmpty());
    }

    public boolean isEmptyCombinationElevationModel() {
        return combinationElevationModel == null || combinationElevationModel.isEmpty();
    }

    public Map<BaseScriptScoreModel, Double> getScoreElevationModel() {
        return scoreElevationModel;
    }

    public Map<QueryModelBuilder, Double> getQueryElevationModel() {
        return queryElevationModel;
    }

    public Map<QueryModelBuilder, Double> getCombinationElevationModel() {
        return combinationElevationModel;
    }

    public String getScoreMode() {
        return scoreMode;
    }

    public String getBoostMode() {
        return boostMode;
    }


    public static final class Builder {
        private Map<BaseScriptScoreModel, Double> scoreElevationModel;
        private Map<QueryModelBuilder, Double> queryElevationModel;
        private Map<QueryModelBuilder, Double> combinationElevationModel;
        private String scoreMode;
        private String boostMode;

        private Builder() {
        }

        public Builder scoreElevationModel(Map<BaseScriptScoreModel, Double> score) {
            this.scoreElevationModel = score;
            return this;
        }

        public Builder queryElevationModel(Map<QueryModelBuilder, Double> query) {
            this.queryElevationModel = query;
            return this;
        }

        public Builder combinationElevationModel(Map<QueryModelBuilder, Double> combination) {
            this.combinationElevationModel = combination;
            return this;
        }

        public Builder scoreMode(String scoreMode) {
            this.scoreMode = scoreMode;
            return this;
        }

        public Builder scoreMode(CombineFunction scoreMode) {
            this.scoreMode = scoreMode.name();
            return this;
        }

        public Builder boostMode(String boostMode) {
            this.boostMode = boostMode;
            return this;
        }

        public Builder boostMode(CombineFunction boostMode) {
            this.boostMode = boostMode.name();
            return this;
        }

        public ElevationFactor build() {
            return new ElevationFactor(this);
        }
    }
}
