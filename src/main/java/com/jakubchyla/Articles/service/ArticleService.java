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

    public Article getById(Long articleid) {
        return articleRepository.findById(articleid).orElse(null);
    }

    public void deleteArticle(Long articleid) {
        boolean exists = articleRepository.existsById(articleid);
        if (!exists) {
            throw new IllegalStateException("Article is not exists");
        }
        articleRepository.deleteById(articleid);
    }
}

