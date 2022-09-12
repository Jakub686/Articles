package com.jakubchyla.Articles.service;

import com.jakubchyla.Articles.entity.Article;
import com.jakubchyla.Articles.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    public List<Article> saveArticlesList(List<Article> articleList) {
        return articleRepository.saveAll(articleList);
    }

    public Article saveArticle(Article article) {
        return articleRepository.save(article);
    }

    public List<Article> findAllArticles() {
        return articleRepository.findAll();
    }

    public Article getById(Long id) {
        return articleRepository.findById(id).orElse(null);
    }

    public void deleteArticle(Long id) {
        boolean exists = articleRepository.existsById(id);
        if (!exists) {
            throw new IllegalStateException("Article is not exists");
        }
        articleRepository.deleteById(id);
    }

    public Article updateArticle(Article article) {
        Article existingArticle = articleRepository.findById(article.getId()).orElse(null);
        existingArticle.setTitle(article.getTitle());
        existingArticle.setContent(article.getContent());
        existingArticle.setMagazineName(article.getMagazineName());
        existingArticle.setName(article.getName());
        existingArticle.setSurname(article.getSurname());
        return articleRepository.save(existingArticle);
    }

}

