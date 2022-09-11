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

    @GetMapping("")
    public List<Article> getArticles() {
        return articleService.findAllArticles();
    }

    @GetMapping("/{articleid}")
    public Article getById(@PathVariable("articleid") Long articleid) {
        return articleService.getById(articleid);
    }

    //works
    @DeleteMapping("/{articleid}")
    public void deleteArticle(@PathVariable("articleid") Long articleid) {
        articleService.deleteArticle(articleid);
    }

}
