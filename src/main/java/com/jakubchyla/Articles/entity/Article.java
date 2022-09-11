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
@Table(name = "article")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "articleid")
    private Long articleid;
    private String magazineName;
    //private LocalDate date;
    //private LocalDate published;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name ="articleid",referencedColumnName = "articleid")
    private List<Content> content;

    @OneToMany(targetEntity = Author.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "articleid",referencedColumnName = "articleid")
    private List<Author> author;

}