package com.example.android.listofmovies;

/**
 * Created by qichen on 12/3/15.
 * for the movie api service
 */

import retrofit.Call;
import retrofit.http.GET;


/* Retrofit 2.0 */

public interface APIService {

    @GET("/facebook/react-native/master/docs/MoviesExample.json")
    Call<Response> loadRepo();

}