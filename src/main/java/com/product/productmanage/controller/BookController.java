package com.product.productmanage.controller;

import com.product.productmanage.model.Book;
import com.product.productmanage.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class BookController {
    @Autowired
    private BookService bookService;
    @GetMapping("/book")
    public ResponseEntity<List<Book>> findAllBook(){
        List<Book> bookList = bookService.findAll();
        if (bookList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        ResponseEntity responseEntity = new ResponseEntity(bookList, HttpStatus.OK);
        return responseEntity;
    }
//    @GetMapping("api/v1/books/search/{id}")
//    public ResponseEntity<List<Book>> findByCategory(@RequestParam("id") Long id, Pageable pageable){
//        Pageable firstPageWithFiveElements = PageRequest.of(0, 5);
//        List<Book> bookList = bookService.findByCategoryId(id, pageable);
//        if (bookList.isEmpty()){
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        }
//        ResponseEntity responseEntity = new ResponseEntity(bookList, HttpStatus.OK);
//        return responseEntity;
//    }
}
