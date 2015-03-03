package com.bruce.myapplication.callbacks;

import com.bruce.myapplication.pojo.Movie;

import java.util.ArrayList;


/**
 * Created by Windows on 02-03-2015.
 */
public interface BoxOfficeMoviesLoadedListener {
    public void onBoxOfficeMoviesLoaded(ArrayList<Movie> listMovies);
}
