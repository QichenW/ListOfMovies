package com.example.android.listofmovies;

import com.google.gson.annotations.SerializedName;

/**
 * Created by qichen on 12/2/15.
 * class holding a movie's information to populate the recycler view
 */
public class MovieInfo {

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    @SerializedName("title")
    String movieTitle;

}
