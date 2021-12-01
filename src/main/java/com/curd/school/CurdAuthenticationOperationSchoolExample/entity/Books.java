package com.curd.school.CurdAuthenticationOperationSchoolExample.entity;

import javax.persistence.*;

@Entity
@Table(name = "bookdetails")
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @Column(name = "description")
    private String desc;
    private Integer yearofpublication;
    private String booktype;

    public Books() {
    }

    public Books(Long id, String name, String desc, Integer yearofpublication, String booktype) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.yearofpublication = yearofpublication;
        this.booktype = booktype;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getYearofpublication() {
        return yearofpublication;
    }

    public void setYearofpublication(Integer yearofpublication) {
        this.yearofpublication = yearofpublication;
    }

    public String getBooktype() {
        return booktype;
    }

    public void setBooktype(String booktype) {
        this.booktype = booktype;
    }
}
