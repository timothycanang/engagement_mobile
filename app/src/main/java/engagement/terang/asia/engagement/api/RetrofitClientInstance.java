package engagement.terang.asia.engagement.api;

import android.content.Context;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static engagement.terang.asia.engagement.api.Constant.BASE_URL;


public class RetrofitClientInstance {

    private static Retrofit retrofit;

    public static Retrofit getRetrofitInstance(Context ctx) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.addInterceptor(new RequestInterceptor(ctx));
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .client(builder.build())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}