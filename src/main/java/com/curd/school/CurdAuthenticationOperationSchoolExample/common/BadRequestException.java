package com.curd.school.CurdAuthenticationOperationSchoolExample.common;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class BadRequestException extends RuntimeException {

    private List<BookValidationError> errors;

    public BadRequestException(String message, List<BookValidationError> errors){
        super(message);
        this.errors=errors;
    }

}
