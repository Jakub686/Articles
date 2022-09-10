package com.jakubchyla.Articles.repository;

import com.jakubchyla.Articles.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
