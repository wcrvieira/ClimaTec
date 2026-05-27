package br.com.climatec.api;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIService {
    @GET("v1/forecast")

    Call<HttpResponse> getCurrentWeather(
    @Query("longitude") double longitude,
    @Query("latitude") double latitude,
    @Query("current") String currentParams
    );
}
