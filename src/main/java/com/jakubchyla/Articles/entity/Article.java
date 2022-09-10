package com.jakubchyla.Articles.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;

@Entity
@Transactional
@Data
@NoArgsConstructor
@Table(name = "article_details")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "article_id")
    private Long article_id;
    private String magazineName;
    //private date
    //private LocalDate published;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_article_id",referencedColumnName = "article_id")
    private List<Content> content;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_article_id",referencedColumnName = "article_id")
    private List<Author> author;



}