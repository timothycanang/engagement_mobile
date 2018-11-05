package engagement.terang.asia.engagement.api.endpoints.authentication;

import retrofit2.Call;
import retrofit2.http.*;


public interface Authentication {

    @POST("/auth/signin")
    Call<Token> login(@Query("username") String username, @Query("password") String password);

}
