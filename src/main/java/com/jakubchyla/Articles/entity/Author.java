package com.jakubchyla.Articles.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

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
    @Column(name = "authorid")
    private Long authorid;
    private String name;
    private String surname;

    @ManyToOne
    @JoinColumn(name = "articleid")
    private Article article;

}
