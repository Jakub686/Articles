package com.jakubchyla.Articles.repository;

import com.jakubchyla.Articles.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
