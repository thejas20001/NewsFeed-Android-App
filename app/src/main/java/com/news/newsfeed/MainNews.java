package com.news.newsfeed;

import java.util.ArrayList;

public class MainNews {
    private String status;
    private String totalledResults;
    private ArrayList<ModelClass> articles;



    public MainNews(String status, String totalledResults, ArrayList<ModelClass> articles) {
        this.status = status;
        this.totalledResults = totalledResults;
        this.articles = articles;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTotalledResults() {
        return totalledResults;
    }

    public void setTotalledResults(String totalledResults) {
        this.totalledResults = totalledResults;
    }

    public ArrayList<ModelClass> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<ModelClass> articles) {
        this.articles = articles;
    }
}
