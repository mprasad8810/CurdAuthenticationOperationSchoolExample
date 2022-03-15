package com.curd.school.CurdAuthenticationOperationSchoolExample.service;

import com.curd.school.CurdAuthenticationOperationSchoolExample.common.APIResponse;
import com.curd.school.CurdAuthenticationOperationSchoolExample.entity.Authors;
import com.curd.school.CurdAuthenticationOperationSchoolExample.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthorService {

    @Autowired
    public AuthorRepository authorRepository;

    public APIResponse getAuthors(Pageable pageable) {
        Page<Authors> authorList = authorRepository.findAll(pageable);
        APIResponse apiResponse = new APIResponse();


        apiResponse.setData(authorList);
        return apiResponse;
    }
}
