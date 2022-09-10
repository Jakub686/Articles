package com.jakubchyla.Articles.service;

import com.jakubchyla.Articles.entity.Article;
import com.jakubchyla.Articles.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {


    @Autowired
    private ArticleRepository ArticleRepository;

    public List<Article> saveArticlesList(List<Article> articleList) {
        return ArticleRepository.saveAll(articleList);
    }

    public Article saveArticle(Article article) {
        return ArticleRepository.save(article);
    }

    public List<Article> findAllArticles() {
        return ArticleRepository.findAll();
    }

    public Article getById(Long emp_id) {
        return ArticleRepository.findById(emp_id).orElse(null);
    }

    public void deleteEmployee(Long emp_id) {
        boolean exists = ArticleRepository.existsById(emp_id);
        if (!exists) {
            throw new IllegalStateException("employee is not exists");
        }
        ArticleRepository.deleteById(emp_id);
    }
}

