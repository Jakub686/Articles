package com.jakubchyla.Articles.repository;

import com.jakubchyla.Articles.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ArticleRepository extends JpaRepository<Article, Long> {

    @Query("SELECT s FROM Article s WHERE title LIKE %?1% OR content LIKE %?2%")
    List<Article> findByTitleContent(String title, String content);
}
