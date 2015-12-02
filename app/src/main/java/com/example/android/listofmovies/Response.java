package com.example.android.listofmovies;

import java.util.ArrayList;

/**
 * Created by qichen on 12/3/15.
 * for the responses
 */
@SuppressWarnings("unused")
public class Response {
    private int total;
    private ArrayList<MovieInfo> movies;

    public void setMovies(ArrayList<MovieInfo> movies) {
        this.movies = movies;
    }

    public void setTotal(int total) {

        this.total = total;
    }

    public ArrayList<MovieInfo> getMovies() {

        return movies;
    }

    public int getTotal() {

        return total;
    }
}
