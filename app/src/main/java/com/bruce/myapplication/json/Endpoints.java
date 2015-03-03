package com.bruce.myapplication.json;

import com.bruce.myapplication.MyApplication;

import static com.bruce.myapplication.extras.UrlEndpoints.URL_BOX_OFFICE;
import static com.bruce.myapplication.extras.UrlEndpoints.URL_CHAR_AMEPERSAND;
import static com.bruce.myapplication.extras.UrlEndpoints.URL_CHAR_QUESTION;
import static com.bruce.myapplication.extras.UrlEndpoints.URL_PARAM_API_KEY;
import static com.bruce.myapplication.extras.UrlEndpoints.URL_PARAM_LIMIT;

/**
 * Created by Windows on 02-03-2015.
 */
public class Endpoints {
    public static String getRequestUrl(int limit) {

        return URL_BOX_OFFICE
                + URL_CHAR_QUESTION
                + URL_PARAM_API_KEY + MyApplication.API_KEY_ROTTEN_TOMATOES
                + URL_CHAR_AMEPERSAND
                + URL_PARAM_LIMIT + limit;
    }
}
