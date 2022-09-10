package com.jakubchyla.Articles.controller;

import com.jakubchyla.Articles.entity.Article;
import com.jakubchyla.Articles.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @PostMapping("/saveArticle")
    public ResponseEntity<String> saveArticle(@RequestBody Article article) {
        articleService.saveArticle(article);
        return ResponseEntity.ok("Data saved");
    }


    @PostMapping("/saveArticles")
    public ResponseEntity<String> saveArticles(@RequestBody List<Article> articles) {
        articleService.saveArticlesList(articles);
        return ResponseEntity.ok("Data saved");
    }


    @GetMapping("/getArticles")
    public List<Article> getArticles() {
        return articleService.findAllArticles();
    }


    @GetMapping("/getArticle/{article_id}")
    public Article getById(@PathVariable("article_id") Long article_id) {
        return articleService.getById(article_id);
    }

    @DeleteMapping("/DeleteArticle/{article_id}")
    public void deleteEmployee(@PathVariable("article_id") Long article_id) {
        articleService.deleteEmployee(article_id);
    }

}
