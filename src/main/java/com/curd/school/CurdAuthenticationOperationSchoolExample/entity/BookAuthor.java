package com.curd.school.CurdAuthenticationOperationSchoolExample.entity;

import javax.persistence.*;
import java.awt.print.Book;

public class BookAuthor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name= "book_id", referencedColumnName = "id", nullable = false)
    private Book book;

    @ManyToOne
    @JoinColumn(name="author_id", referencedColumnName = "id", nullable = false)
    private Author author;
}
