package com.jakubchyla.Articles.controller;

import com.jakubchyla.Articles.entity.Article;
import com.jakubchyla.Articles.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/articles")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    //works
    @PostMapping("")
    public ResponseEntity<String> saveArticle(@RequestBody Article article) {
        articleService.saveArticle(article);
        return ResponseEntity.ok("Data saved");
    }

    //works
    @GetMapping("")
    public List<Article> getArticles() {
        return articleService.findAllArticles();
    }

    //works
    @GetMapping("/{id}")
    public Article getById(@PathVariable("id") Long id) {
        return articleService.getById(id);
    }

    //works
    @DeleteMapping("/{id}")
    public void deleteArticle(@PathVariable("id") Long id) {
        articleService.deleteArticle(id);
    }

    //works
    @PutMapping("")
    public Article updateArticle(@RequestBody Article article){
        return articleService.updateArticle(article);
    }

}
