package com.jakubchyla.Articles.controller;

import com.jakubchyla.Articles.entity.Article;
import com.jakubchyla.Articles.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/articles")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @PostMapping("")
    public ResponseEntity<Article> saveArticle(@RequestBody Article article) {
        Article newArticle = articleService.saveArticle(article);
        return new ResponseEntity<>(newArticle, HttpStatus.CREATED);
    }

    @GetMapping("")
    public ResponseEntity<List<Article>> getArticles() {
        List<Article> articles = articleService.findAllArticles();
        return new ResponseEntity<>(articles, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Article> getById(@PathVariable("id") Long id) {
        if (articleService.getById(id) == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(articleService.getById(id), HttpStatus.OK);
        }
    }

    @GetMapping("/search")
    public ResponseEntity<List<Article>> findByTitleContent(@RequestParam String title,@RequestParam String content) {
        if (articleService.findByTitleContent(title,content) == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(articleService.findByTitleContent(title, content), HttpStatus.OK);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Long> deleteArticle(@PathVariable("id") Long id) {
        if (articleService.getById(id) == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        } else {
            articleService.deleteArticle(id);
            return new ResponseEntity<>(id, HttpStatus.OK);
        }
    }

    @PutMapping("")
    public ResponseEntity<Article> updateArticle(@RequestBody Article article) {
        return new ResponseEntity<>(articleService.updateArticle(article), HttpStatus.OK);
    }
}
