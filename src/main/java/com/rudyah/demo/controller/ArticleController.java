package com.rudyah.demo.controller;

import com.rudyah.demo.model.Article;
import com.rudyah.demo.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/article")
@RestController
public class ArticleController {

    private final ArticleService articleService;

    @Autowired
    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping
    public List<Article> getAll(){
        return articleService.getAllArticles();
    }

    @GetMapping (value = "/category/{category}")
    public List<Article> getByCategory(@PathVariable("category") String category){
        return articleService.getArticlesByCategory(category);
    }

    @GetMapping(value = "{id}")
    public Article getById(@PathVariable("id") String id){
        return articleService.getArticle(id);
    }

    @PostMapping
    public Article addArticle(@RequestBody Article student){
        return articleService.addArticle(student);
    }

    @DeleteMapping(value = "{id}")
    public void removeArticle(@PathVariable String id){
        articleService.removeArticle(id);
    }
}