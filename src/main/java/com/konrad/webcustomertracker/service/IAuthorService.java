package com.konrad.webcustomertracker.service;

import com.konrad.webcustomertracker.entity.Author;
import java.util.List;

public interface IAuthorService {
    List<Author> findAll();
}
