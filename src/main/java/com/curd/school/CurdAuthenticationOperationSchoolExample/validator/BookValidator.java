package com.curd.school.CurdAuthenticationOperationSchoolExample.validator;

import com.curd.school.CurdAuthenticationOperationSchoolExample.common.BookValidationError;
import com.curd.school.CurdAuthenticationOperationSchoolExample.entity.Books;
import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Component;

import javax.swing.text.StringContent;
import java.util.ArrayList;
import java.util.List;

@Component
public class BookValidator {

    public List<BookValidationError> createBookRequestValidator(Books books) {

        List<BookValidationError> errors = new ArrayList<>();

        if(Strings.isEmpty(books.getName()) || books.getName() == null) {
            errors.add(new BookValidationError("name","book name is null"));
        }

        if(books.getYearofpublication() == null){
            errors.add(new BookValidationError("yop", "yop is null"));
        }

        if(books.getBooktype() == null){
            errors.add(new BookValidationError("BookType", "BookType is null"));
        }

        return errors;
    }
}
