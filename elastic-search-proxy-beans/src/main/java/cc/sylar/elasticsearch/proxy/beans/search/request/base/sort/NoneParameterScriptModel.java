package cc.sylar.elasticsearch.proxy.beans.search.request.base.sort;

/**
 * @author sylar
 * @Description:
 * @date 2020/4/28 11:52 下午
 */
public class NoneParameterScriptModel extends BaseSortModel<Void> {

    private NoneParameterScriptModel(Builder builder) {
        super(builder);
    }

    public static final class Builder extends BaseSortModel.Builder<Builder, Void> {

        @Override
        public Builder value(Void val) {
            return self();
        }

        @Override
        public NoneParameterScriptModel build() {
            return new NoneParameterScriptModel(this);
        }
    }

}
