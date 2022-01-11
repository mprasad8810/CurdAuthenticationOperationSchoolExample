package com.curd.school.CurdAuthenticationOperationSchoolExample.repository;

import com.curd.school.CurdAuthenticationOperationSchoolExample.entity.BookAuthor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface BookAuthorRepository extends JpaRepository<BookAuthor,Long> {
    List<BookAuthor> findAllByBooks_id(Long BookId);
}
