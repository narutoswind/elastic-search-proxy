package cc.sylar.elasticsearch.proxy.beans.search.request.fuction;


import cc.sylar.elasticsearch.proxy.beans.search.request.base.source.BaseSourceModel;

/**
 * @author sylar
 * @Description: source interface
 * @date 2019-04-09 09:56
 */
public interface Source {

    /**
     * defined field returned
     * mapping field or script field
     * script field
     * @see
     * @param baseSourceModel
     * @return
     */
    Source source(BaseSourceModel baseSourceModel);

    /**
     * defined fields returned
     * @param baseSourceModel
     * @return
     */
    Source source(BaseSourceModel... baseSourceModel);
}
