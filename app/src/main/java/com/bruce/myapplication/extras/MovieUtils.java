package com.bruce.myapplication.extras;

import com.android.volley.RequestQueue;
import com.bruce.myapplication.json.Endpoints;
import com.bruce.myapplication.json.Parser;
import com.bruce.myapplication.json.Requestor;
import com.bruce.myapplication.MyApplication;
import com.bruce.myapplication.pojo.Movie;

import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by Windows on 02-03-2015.
 */
public class MovieUtils {
    public static ArrayList<Movie> loadBoxOfficeMovies(RequestQueue requestQueue) {
        JSONObject response = Requestor.sendRequestBoxOfficeMovies(requestQueue, Endpoints.getRequestUrl(30));
        ArrayList<Movie> listMovies = Parser.parseJSONResponse(response);
        MyApplication.getWritableDatabase().insertMoviesBoxOffice(listMovies, true);
        return listMovies;
    }
}
