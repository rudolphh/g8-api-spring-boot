package com.rudyah.demo.service;

import com.rudyah.demo.dao.ArticleDaoImpl;
import com.rudyah.demo.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {

    private final ArticleDaoImpl articleDao;

    @Autowired
    public ArticleService(ArticleDaoImpl articleDao) {
        this.articleDao = articleDao;
    }

    public List<Article> getAllArticles(){
        return articleDao.getAllArticles();
    }

    public List<Article> getArticlesByCategory(String category){
        return articleDao.getArticlesByCategory(category);
    }

    public Article getArticle(String id){
        return articleDao.getArticleById(id);
    }

    public Article getArticleByTitle(String title){
        return articleDao.getArticleByTitle(title);
    }

    public Article addArticle(Article article){
        return articleDao.addArticle(article);
    }

    public Article updateArticle(Article article){
        return articleDao.updateArticle(article);
    }

    public void removeArticle(String id){
        Article article = articleDao.getArticleById(id);
        articleDao.deleteArticle(article);
    }
}