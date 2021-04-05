package com.rudyah.demo.repository;

import com.rudyah.demo.model.Article;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ArticleRepository extends MongoRepository<Article, String> {
    Article findByTitle(String title);
}
