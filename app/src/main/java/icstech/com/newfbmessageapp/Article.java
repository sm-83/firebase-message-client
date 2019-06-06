package icstech.com.newfbmessageapp;

/**
 * Created by Siddarth on 24/03/2018.
 */

public class Article {

    public String title;
    public String author;

    public Article() {
        // Default constructor required for calls to DataSnapshot.getValue(Article.class)
    }

    public Article(String title, String author) {
        this.title = title;
        this.author = author;
    }
}
