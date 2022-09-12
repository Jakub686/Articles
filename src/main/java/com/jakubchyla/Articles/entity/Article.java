package com.jakubchyla.Articles.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Entity
@Transactional
@Data
@NoArgsConstructor
@Table(name = "article")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    private String title;
    private String content;
    //pricate Date date;
    private String magazineName;
    private String name;
    private String surname;

    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp = new Date(System.currentTimeMillis());
    //private Date published;

}