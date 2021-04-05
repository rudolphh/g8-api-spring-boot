package com.rudyah.demo.dao;

import com.rudyah.demo.model.Article;
import com.rudyah.demo.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ArticleDaoImpl implements ArticleDao{

    @Autowired
    private final ArticleRepository articleRepository;

    public ArticleDaoImpl(ArticleRepository articleRepository){
        this.articleRepository = articleRepository;
    }

    @Override
    public List<Article> getAllArticles() {
        return articleRepository.findAll();
    }

    @Override
    public Article addArticle(Article article) {
        return articleRepository.insert(article);
    }

    @Override
    public Article getArticleById(String id) {
        Optional<Article> article = articleRepository.findById(id);
        return article.orElse(null);
    }

    @Override
    public Article getArticleByTitle(String title) {
        return articleRepository.findByTitle(title);
    }


    @Override
    public Article updateArticle(Article newArticle) {
        return articleRepository.save(newArticle);
    }

    @Override
    public void deleteArticle(Article article) {
        articleRepository.delete(article);
    }
}
