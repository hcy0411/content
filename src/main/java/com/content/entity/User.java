package com.content.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Setter
@Getter
@Entity
@Table(name = "user")
public class User {
    private String username;
    private String nickname;
    private String email;
    private String session;
}

