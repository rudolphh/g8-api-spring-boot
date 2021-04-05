package com.rudyah.demo.repository;

import com.rudyah.demo.model.Article;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ArticleRepository extends MongoRepository<Article, String> {
    Article findByTitle(String title);
    List<Article> findArticlesByCategory(String category);
}
