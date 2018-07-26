package com.konrad.webcustomertracker.service;

import com.konrad.webcustomertracker.entity.Book;
import java.util.List;

public interface IBookService {
    void save(Book book);

    List<String> findAllCategories();

    List<Book> findAll();

    void delete(Long id);
}
