package com.dwd.www.untils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * Created by Chen WenJie on 2018/12/25.
 */
public class JsonUtil {

    private JSONObject JsonBody;

    public JSONObject getJsonBody() {
        return JsonBody;
    }

    public void setJsonBody(JSONObject jsonBody) {
        JsonBody = jsonBody;
    }

    public  JSONObject stringToJson(String s) {
        JSONObject jsonObject = JSON.parseObject(s);
        return jsonObject;
    }
}
