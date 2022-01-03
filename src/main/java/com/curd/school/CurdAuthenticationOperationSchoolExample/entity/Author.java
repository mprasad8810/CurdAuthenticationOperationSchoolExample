package com.curd.school.CurdAuthenticationOperationSchoolExample.entity;

import lombok.Getter;
import lombok.Setter;
import org.joda.time.DateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String gender;
    private DateTime createdAt;
    private DateTime updatedAt;

    public Author() {
    }

    public Author(Long id, String name, String gender, DateTime createdBy, DateTime updatedBy) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.createdAt = createdBy;
        this.updatedAt = updatedBy;
    }
}
