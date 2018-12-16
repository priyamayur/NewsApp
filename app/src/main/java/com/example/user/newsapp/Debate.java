package com.example.user.newsapp;

public class Debate {


    private String mSection;
    private String mArticle;
    private String mAuthor;
    private String mTime;
    private String mUrl;


    public Debate(String section, String article,String author, String time, String url) {
        mSection = section;
        mArticle = article;
        mTime = time;
        mAuthor=author;
        mUrl = url;
    }



    public String getSection() {
        return mSection;
    }


    public String getArticle() {
        return mArticle;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public String getTime() {
        return mTime;
    }


    public String getUrl() {
        return mUrl;
    }
}
