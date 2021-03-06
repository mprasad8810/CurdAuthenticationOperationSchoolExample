package com.curd.school.CurdAuthenticationOperationSchoolExample.controller;

import com.curd.school.CurdAuthenticationOperationSchoolExample.common.APIResponse;
import com.curd.school.CurdAuthenticationOperationSchoolExample.dto.BookDTO;
import com.curd.school.CurdAuthenticationOperationSchoolExample.entity.Books;
import com.curd.school.CurdAuthenticationOperationSchoolExample.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
public class BookController {

    @Autowired
    public BookService bookService;

    // fetch data from My SQL DB
    //GET
    @RequestMapping(value = "/books")
    public List<Books> getAllBooks(
            @RequestParam(value = "yearOfPublication", required = false) Set<Integer> yearofpublication,
            @RequestParam(value = "bookType", required = false) Set<String> booktype) {
        return bookService.getBooks(yearofpublication, booktype);
    }

    // Add Data to My SQL DB
    // POST
    @RequestMapping(value = "/books",method = RequestMethod.POST)
    public Books addBook(@RequestBody Books books) {
        return bookService.addBook(books);
    }

    // Fetch one element from DB
    //Get
    @RequestMapping(value = "/books/{id}")
    public BookDTO getBook(
            @PathVariable Long id,
            @RequestParam(value="authorData",required=false) boolean authorData
           ){
        return bookService.getBook(id,authorData);
    }

    // PUT Method
    @RequestMapping(value = "/books",method = RequestMethod.PUT)
    public Books updateBook(@RequestBody Books books){
         return bookService.updateBook(books);
    }

    // Delete Method
    @RequestMapping(value = "/books/{id}",method = RequestMethod.DELETE)
    public String removeBook(@PathVariable Long id){
        return bookService.removeBook(id);
    }

    @GetMapping("/raw/books")
    @ResponseStatus(value=HttpStatus.OK)
    public APIResponse getBookByRawQuery(@RequestParam(value = "yearOfPublication", required = false) Set<Integer> yearofpublication){
        return bookService.getBookByRawQuery(yearofpublication);
    }

    @GetMapping("/caughtException")
    public APIResponse getCaughtException(@RequestParam(value = "number", required = false) Integer yearofpublication){
        return bookService.getCaughtException(yearofpublication);
    }

}
