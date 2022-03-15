package com.curd.school.CurdAuthenticationOperationSchoolExample.controller;

import com.curd.school.CurdAuthenticationOperationSchoolExample.common.APIResponse;
import com.curd.school.CurdAuthenticationOperationSchoolExample.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController {

    @Autowired
    public AuthorService authorService;

    @GetMapping("/authors")
    private APIResponse getAuthors(Pageable pageable){
        APIResponse apiResponse = authorService.getAuthors(pageable);
        return apiResponse;
    }
}
