package com.jakubchyla.Articles.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.transaction.Transactional;

@Entity
@Transactional
@Data
@NoArgsConstructor
@Table(name = "author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "author_id")
    private Long authorId;
    private String name;
    private String surname;

    @ManyToOne
    @JoinColumn(name = "fk_article_id")
    private Article article;
}
