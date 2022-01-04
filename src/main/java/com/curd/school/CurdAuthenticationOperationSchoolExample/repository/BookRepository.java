package com.curd.school.CurdAuthenticationOperationSchoolExample.repository;

import com.curd.school.CurdAuthenticationOperationSchoolExample.entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

@Repository
public interface BookRepository extends JpaRepository<Books,Long> {
    List<Books> findAllByYearofpublicationInAndBooktypeIn(Set<Integer> yearofpublication, Set<String> booktype);

    String rawQuery = "select * from bookdetails where yearofpublication IN ?1";

    @Modifying
    @Query(nativeQuery = true, value = rawQuery)
    List<Books> findAllByYearofpublicationIn(Set<Integer> yearofpublication);
}
