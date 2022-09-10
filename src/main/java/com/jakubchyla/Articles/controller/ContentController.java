package com.jakubchyla.Articles.controller;

import com.jakubchyla.Articles.entity.Content;
import com.jakubchyla.Articles.repository.ContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContentController {

    @Autowired
    private ContentRepository contentRepository;

    @GetMapping("/getContent")
    public List<Content> getContent() {
        return contentRepository.findAll();
    }
}
