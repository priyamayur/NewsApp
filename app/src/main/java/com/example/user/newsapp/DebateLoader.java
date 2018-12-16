package com.example.user.newsapp;

import java.util.List;

import android.content.AsyncTaskLoader;
import android.content.Context;

public class DebateLoader extends AsyncTaskLoader<List<Debate>> {

    /**
     * Query URL
     */
    private String mUrl;


    public DebateLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }


    @Override
    public List<Debate> loadInBackground() {
        if (mUrl == null) {
            return null;
        }


        List<Debate> debates = fetchData.fetchDebateData(mUrl);
        return debates;
    }

}
