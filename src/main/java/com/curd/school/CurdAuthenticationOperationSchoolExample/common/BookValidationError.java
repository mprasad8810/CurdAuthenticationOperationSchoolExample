package com.curd.school.CurdAuthenticationOperationSchoolExample.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@AllArgsConstructor
public class BookValidationError {

    private String target;
    private String message;
}
