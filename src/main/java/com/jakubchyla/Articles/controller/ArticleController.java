package com.jakubchyla.Articles.controller;

import com.jakubchyla.Articles.entity.Article;
import com.jakubchyla.Articles.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/articles")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    //works
//    @PostMapping("")
//    public ResponseEntity<Article> saveArticle(@RequestBody Article article) {
//        articleService.saveArticle(article);
//        return new ResponseEntity<>(article, HttpStatus.OK);
//    }

    @PostMapping("")
    public ResponseEntity<Article> saveArticle(@RequestBody Article article) {
        Article newArticle = articleService.saveArticle(article);
        return new ResponseEntity<>(newArticle, HttpStatus.CREATED);
    }

    //works
    @GetMapping("")
    public List<Article> getArticles() {
        if (articleService.findAllArticles() == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        } else {
            return articleService.findAllArticles();
        }
    }

    //works
    @GetMapping("/{id}")
    public Article getById(@PathVariable("id") Long id) {
        if (articleService.getById(id) == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        } else {
            return articleService.getById(id);
        }
    }

    //works
    @GetMapping("/search")
    public List<Article> findByTitle(@RequestParam String title) {
        if (articleService.findByTitle(title) == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        } else {
            return articleService.findByTitle(title);
        }
    }

    //works
    @DeleteMapping("/{id}")
    public ResponseEntity<Long> deleteArticle(@PathVariable("id") Long id) {
        articleService.deleteArticle(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }

    //works
    @PutMapping("")
    public Article updateArticle(@RequestBody Article article){
        return articleService.updateArticle(article);
    }
}
