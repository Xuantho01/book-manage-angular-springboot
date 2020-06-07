package com.product.productmanage.service;

import com.product.productmanage.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {
    List<Book> findAll();

    List<Book> findByCategoryId(@Param("id") Long id, Pageable pageable);
}
