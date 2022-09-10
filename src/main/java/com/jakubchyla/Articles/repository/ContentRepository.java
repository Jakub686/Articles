package com.jakubchyla.Articles.repository;

import com.jakubchyla.Articles.entity.Content;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContentRepository extends JpaRepository<Content, Long> {
}