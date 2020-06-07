package com.product.productmanage.service.impl;

import com.product.productmanage.model.Book;
import com.product.productmanage.repository.BookRepository;
import com.product.productmanage.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;
    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public List<Book> findByCategoryId(Long id, Pageable pageable) {
        return bookRepository.findByCategoryId(id, pageable);
    }
}
