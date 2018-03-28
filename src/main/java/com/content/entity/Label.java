package com.content.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Setter
@Getter
@Entity
@Table(name = "label")
public class Label {
    private String id;
    private String name;
    private String type;
}
