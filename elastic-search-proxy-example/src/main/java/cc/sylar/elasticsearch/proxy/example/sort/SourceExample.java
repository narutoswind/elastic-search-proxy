package cc.sylar.elasticsearch.proxy.example.sort;

import cc.sylar.elasticsearch.proxy.beans.search.request.base.source.FiledSourceModel;

/**
 * @author sylar
 * @Description:
 * @date 2020/5/2 1:17 下午
 */
public class SourceExample {


    public void sourceBuild() {
        FiledSourceModel filedSourceModel = FiledSourceModel.newBuilder().field("fieldName").build();
    }
}
