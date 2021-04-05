package com.rudyah.demo.dao;

import com.rudyah.demo.model.Article;

import java.util.List;

public interface ArticleDao {
    List<Article> getAllArticles();
    Article getArticleById(String id);
    Article getArticleByTitle(String title);
    Article addArticle(Article Article);
    Article updateArticle(Article Article);
    void deleteArticle(Article Article);
}