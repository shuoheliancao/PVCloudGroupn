package pv.com.pvcloudgo.msg;

import java.util.List;

import pv.com.pvcloudgo.bean.CRoot1;
import pv.com.pvcloudgo.bean.Category;

/**
 * Created by stefan on 17/1/9.
 */

public class CategoryRootResp extends BaseRespMsg {

    public Result results;

    public Result getResults() {
        return results;
    }

    public class Result {
        List<Category> ptList;

        CRoot1 productType;

        public List<Category> getPtList() {
            return ptList;
        }

        public CRoot1 getProductType() {
            return productType;
        }
    }
}
