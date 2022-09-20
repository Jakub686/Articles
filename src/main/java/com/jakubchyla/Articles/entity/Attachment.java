package com.jakubchyla.Articles.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Data
@NoArgsConstructor
public class Attachment {

    @Id
    private Long id;
    private String title;
    private String content;
}
