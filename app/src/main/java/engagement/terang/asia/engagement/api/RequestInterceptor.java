package engagement.terang.asia.engagement.api;

import android.content.Context;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class RequestInterceptor implements Interceptor {
    private Context context;

    RequestInterceptor(Context context) {
        this.context = context;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        Request.Builder builder = request.newBuilder().addHeader("Authorization", "Bearer " + StoragePreference.getAccessToken(context))
                .addHeader("Content-Type", "application/json")
                .addHeader("Accept", "*/*");
        return chain.proceed(builder.build());
    }
}
