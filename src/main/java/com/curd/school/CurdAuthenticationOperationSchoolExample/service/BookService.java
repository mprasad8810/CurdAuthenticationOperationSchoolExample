package com.curd.school.CurdAuthenticationOperationSchoolExample.service;

import com.curd.school.CurdAuthenticationOperationSchoolExample.dto.AuthorDTO;
import com.curd.school.CurdAuthenticationOperationSchoolExample.dto.BookDTO;
import com.curd.school.CurdAuthenticationOperationSchoolExample.entity.Books;
import com.curd.school.CurdAuthenticationOperationSchoolExample.entity.Authors;
import com.curd.school.CurdAuthenticationOperationSchoolExample.entity.BookAuthor;
import com.curd.school.CurdAuthenticationOperationSchoolExample.repository.BookAuthorRepository;
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

    @Autowired
    public BookAuthorRepository bookAuthorRepository;

    // Fetch Data from My SQL
    public List<Books> getBooks(Set<Integer> yearofpublication, Set<String> booktype) {
        List<Books> booksList = new ArrayList<>();

        if (yearofpublication != null || booktype != null) {
            return bookRepository.findAllByYearofpublicationInAndBooktypeIn(yearofpublication, booktype);
        } else {
            bookRepository.findAll().forEach(book -> booksList.add(book));
        }
        return booksList;
    }

    // Add Data to My SQL
    public Books addBook(Books book) {
      return bookRepository.save(book);
    }

    // Get book using its ID
    public BookDTO getBook(Long id, boolean authorData) {

        List<BookAuthor> bookAuthors = null;

        Optional<Books> books = bookRepository.findById(id);
        if (authorData) {
            bookAuthors = bookAuthorRepository.findAllByBooks_id(id);
        }

        BookDTO bookDTO = new BookDTO();
        bookDTO.setId(books.get().getId());
        bookDTO.setName(books.get().getName());
        bookDTO.setDesc(books.get().getDesc());
        bookDTO.setYearofpublication(books.get().getYearofpublication());
        bookDTO.setBooktype(books.get().getBooktype());

        List<AuthorDTO> authorDTOList = new ArrayList<AuthorDTO>();

        if (bookAuthors != null) {
            for (BookAuthor bookAuthor : bookAuthors) {

                Authors author = bookAuthor.getAuthors();

                AuthorDTO authorDTO = new AuthorDTO();
                authorDTO.setId(author.getId());
                authorDTO.setName(author.getName());
                authorDTO.setGender(author.getGender());

                authorDTOList.add(authorDTO);

            }
            bookDTO.setAuthors(authorDTOList);
        }
        return bookDTO;
    }

    //PUT Update the value in DB
    public Books updateBook(Books book) {
        return bookRepository.save(book);
    }

    //Delete remove book from My SQL
    public String removeBook(Long id) {
        bookRepository.deleteById(id);
        return "Book record deleted";
    }

    public List<Books> getBookByRawQuery(Set<Integer> yearofpublication) {
        List<Books> bookList = bookRepository.findAllByYearofpublicationIn(yearofpublication);
        return bookList;
    }
}
