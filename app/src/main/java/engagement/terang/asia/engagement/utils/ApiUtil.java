package engagement.terang.asia.engagement.utils;

import android.content.Context;

import engagement.terang.asia.engagement.api.RetrofitClientInstance;
import engagement.terang.asia.engagement.api.endpoints.authentication.Authentication;


public class ApiUtil {


    private ApiUtil() {
    }
    public static Authentication authUtil(Context context) {
        return RetrofitClientInstance.getRetrofitInstance(context).create(Authentication.class);
    }
}