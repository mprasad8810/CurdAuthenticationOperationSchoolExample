package com.curd.school.CurdAuthenticationOperationSchoolExample.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class BookAuthor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name= "book_id", referencedColumnName = "id", nullable = false)
    private Books books;

    @ManyToOne
    @JoinColumn(name="author_id", referencedColumnName = "id", nullable = false)
    private Authors authors;
}
