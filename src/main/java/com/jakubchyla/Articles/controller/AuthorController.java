package com.jakubchyla.Articles.controller;

import com.jakubchyla.Articles.entity.Author;
import com.jakubchyla.Articles.repository.AuthorRepository;;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorController {

    @Autowired
    private AuthorRepository authorRepository;

    @GetMapping("/getAuthor")
    public List<Author> getAuthor() {
        return authorRepository.findAll();
    }
}
