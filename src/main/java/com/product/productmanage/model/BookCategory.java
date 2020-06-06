package com.product.productmanage.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "tbl_category")
public class BookCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "category_name")
    private String categoryName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
    private Set<Book> book;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
//
//    @OneToMany(mappedBy = "category")
//    public Set<Book> getBook() {
//        return book;
//    }

    public void setBook(Set<Book> book) {
        this.book = book;
    }
}
