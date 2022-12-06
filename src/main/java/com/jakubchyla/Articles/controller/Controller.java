package com.jakubchyla.Articles.controller;

import com.jakubchyla.Articles.entity.Article;
import com.jakubchyla.Articles.service.ArticleService;
import com.jakubchyla.Articles.service.AttachmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/articles")
public class Controller {

    @Autowired
    private ArticleService articleService;

    @Autowired
    private AttachmentService attachmentService;

    @PostMapping("")
    public ResponseEntity<Article> saveArticle(@Valid @RequestBody Article article) {
        Article newArticle = articleService.saveArticle(article);
        return new ResponseEntity<>(newArticle, HttpStatus.CREATED);
    }

    @GetMapping("")
    public ResponseEntity<List<Article>> getArticles() {
        List<Article> articles = articleService.findAllArticles();
        return new ResponseEntity<>(articles, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Article> getById(@PathVariable Long id) {
        if (articleService.getById(id) == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(articleService.getById(id), HttpStatus.OK);
        }
    }

    @GetMapping("/search")
    public ResponseEntity<List<Article>> findByTitleContent(@RequestParam String title, @RequestParam String content) {
        if (articleService.findByTitleContent(title, content) == null) {
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

    @DeleteMapping("/attachment/{id}")
    public ResponseEntity<Long> deleteAttachment(@PathVariable("id") Long id) {
        if (attachmentService.getById(id) == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        } else {
            attachmentService.deleteAttachment(id);
            return new ResponseEntity<>(id, HttpStatus.OK);
        }
    }
}
