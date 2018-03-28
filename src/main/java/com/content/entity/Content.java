package com.content.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Setter
@Getter
@Entity
@Table(name = "content")
public class Content {
    private String id;
    private String userId;
    private int status;
    private String content;
    private String imgUrl;
}
