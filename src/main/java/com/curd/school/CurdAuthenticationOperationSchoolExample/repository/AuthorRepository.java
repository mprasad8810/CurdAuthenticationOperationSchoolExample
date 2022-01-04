package com.curd.school.CurdAuthenticationOperationSchoolExample.repository;

import com.curd.school.CurdAuthenticationOperationSchoolExample.entity.Authors;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Authors,Long> {
}
