package com.curd.school.CurdAuthenticationOperationSchoolExample.repository;

import com.curd.school.CurdAuthenticationOperationSchoolExample.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Long> {
}
