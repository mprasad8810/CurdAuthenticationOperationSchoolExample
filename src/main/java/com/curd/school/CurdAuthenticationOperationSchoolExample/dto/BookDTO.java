package com.curd.school.CurdAuthenticationOperationSchoolExample.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
public class BookDTO {
    private Long id;
    private String name;
    private String desc;
    private Integer yearofpublication;
    private String booktype;

    private List<AuthorDTO> authors;
}
