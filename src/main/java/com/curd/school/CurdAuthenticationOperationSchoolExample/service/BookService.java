package com.curd.school.CurdAuthenticationOperationSchoolExample.service;

import com.curd.school.CurdAuthenticationOperationSchoolExample.entity.Books;
import com.curd.school.CurdAuthenticationOperationSchoolExample.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class BookService {

    @Autowired
    public BookRepository bookRepository;

    // Fetch Data from My SQL
    public List<Books> getBooks(Set<Integer> yearofpublication, Set<String> booktype) {
        List<Books> booksList = new ArrayList<>();

        if (yearofpublication != null || booktype != null ) {
            return bookRepository.findAllByYearofpublicationInAndBooktypeIn(yearofpublication, booktype);
        }else{
            bookRepository.findAll().forEach(book -> booksList.add(book));
        }
        return booksList;
    }

    // Add Data to My SQL
    public Books addBook(Books book) {
      return bookRepository.save(book);
    }

    // Get book using its ID
    public Optional<Books> getBook(Long id){
        return bookRepository.findById(id);
    }

    //PUT Update the value in DB
    public Books updateBook(Books book){
        return bookRepository.save(book);
    }

    //Delete remove book from My SQL
    public String removeBook(Long id){
        bookRepository.deleteById(id);
         return "Book record deleted";
    }

    public List<Books> getBookByRawQuery(Set<Integer> yearofpublication) {
        List<Books> bookList = bookRepository.findAllByYearofpublicationIn(yearofpublication);
        return bookList;
    }
}
