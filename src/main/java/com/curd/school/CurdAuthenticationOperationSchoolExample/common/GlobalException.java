package com.curd.school.CurdAuthenticationOperationSchoolExample.common;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletResponse;

@ControllerAdvice
public class GlobalException {

    @ExceptionHandler
    public ResponseEntity exceptionHandler(Exception e){
        APIResponse apiResponse = new APIResponse();
        apiResponse.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        apiResponse.setData("No data available");
        apiResponse.setError("...OOPS Request failed! Please check the inputs");
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR.value()).body(apiResponse);
    }

    @ExceptionHandler
    public ResponseEntity badRequestHandler(BadRequestException e){

        APIResponse apiResponse = new APIResponse();
        apiResponse.setStatus(HttpStatus.BAD_REQUEST.value());
        apiResponse.setError(e.getErrors());

        return ResponseEntity.status(HttpStatus.BAD_REQUEST.value()).body(apiResponse);
    }
}
