package cc.sylar.elasticsearch.proxy.beans.search.request.fuction;

import cc.sylar.elasticsearch.proxy.beans.search.request.base.sort.ScriptSortModel;
import cc.sylar.elasticsearch.proxy.beans.search.request.base.sort.BaseSortModel;

/**
 * @author sylar
 * @Description: sort interface
 *               used to define sort fields or sort scripts
 * @date 2019-04-09 09:44
 */
public interface Sort {

    /**
     * can be passed mapping field in for sorting
     * @see BaseSortModel
     * or script
     * use script sort,the field name
     * @see
     * if script field constants don't contain it.this would be used to script id
     * @see ScriptSortModel
     *
     * @param baseSortModel
     * @return
     */
    Sort sort(BaseSortModel baseSortModel);

    /**
     * sort model for multi
     * @param baseSortModel
     * @return
     */
    Sort sort(BaseSortModel... baseSortModel);

}
