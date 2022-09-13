package com.jakubchyla.Articles.repository;

import com.jakubchyla.Articles.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArticleRepository extends JpaRepository<Article, Long> {

    List<Article> findByTitle(String content);
}
