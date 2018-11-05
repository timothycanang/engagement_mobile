package engagement.terang.asia.engagement.api;

import android.content.Context;

import engagement.terang.asia.engagement.api.endpoints.authentication.Authentication;


public class ApiUtilities {


    private ApiUtilities() {
    }
    public static Authentication authUtil(Context context) {
        return RetrofitClientInstance.getRetrofitInstance(context).create(Authentication.class);
    }
}