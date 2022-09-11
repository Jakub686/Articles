package com.jakubchyla.Articles.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.transaction.Transactional;

@Entity
@Transactional
@Data
@NoArgsConstructor
@Table(name = "content")
public class Content {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "contentid")
    private Long contentid;
    private String title;
    private String text;

    @ManyToOne
    @JoinColumn(name = "articleid")
    private Article article;
}
