package com.curd.school.CurdAuthenticationOperationSchoolExample.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor()
public class APIResponse {
    private Integer status;
    private Object data;
    private Object error;
}
