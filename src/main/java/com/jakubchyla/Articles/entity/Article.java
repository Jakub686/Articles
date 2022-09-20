package com.jakubchyla.Articles.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String content;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date published;
    private String magazineName;
    private String name;
    private String surname;

    @Temporal(TemporalType.TIMESTAMP)
    final private Date timestamp = new Date(System.currentTimeMillis());

    @OneToMany(targetEntity = Attachment.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="article_id",referencedColumnName = "id")
    private List<Attachment> attachments;
}