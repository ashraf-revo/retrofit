package org.revo.Service.Service;

import org.revo.Service.domain.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

/**
 * Created by revo on 4/17/16.
 */
public interface TayehService {

    @GET("account")
    Call<User> account();

    @GET("rabbit")
    Call<Rabbit> rabbit();


    @GET("images")
    Call<List<Child>> images();

    @GET("imageInfo/{id}")
    Call<Child> imageInfo(@Path("id") String id);

    @GET("suggested/{id}")
    Call<List<SuggestedChild>> suggested(@Path("id") String id);


    @POST("searchcriteria")
    @Headers("Content-Type: application/json")
    Call<List<Child>> searchcriteria(@Body SearchCriteria searchCriteria);

    @POST("search")
    @Headers("Content-Type: application/json")
    Call<List<SuggestedChild>> search(@Body Child child);

    @POST("upload")
    @Headers("Content-Type: application/json")
    Call<Void> upload(@Body Child child);
}
