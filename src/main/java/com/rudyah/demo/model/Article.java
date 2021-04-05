package com.rudyah.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "news_list")

public class Article {

    private final String title;
    private final String description;
    private final String url;
    private final String urlToImage;
    private final String publishedAt;
    private final long insertTime;
    private final String category;

    @Id
    private String id;

    public Article(@JsonProperty("title") String title, @JsonProperty("description") String description,
                   @JsonProperty("url") String url, @JsonProperty("urlToImage") String urlToImage,
                   @JsonProperty("publishedAt") String publishedAt, @JsonProperty("insertTime") long insertTime,
                   @JsonProperty("category") String category) {

        this.title = title;
        this.description = description;
        this.url = url;
        this.urlToImage = urlToImage;
        this.publishedAt = publishedAt;
        this.insertTime = insertTime;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public String getUrlToImage() {
        return urlToImage;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public long getInsertTime() {
        return insertTime;
    }

    public String getCategory() {
        return category;
    }
}