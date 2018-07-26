package com.konrad.webcustomertracker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.konrad.webcustomertracker.entity.Author;
import com.konrad.webcustomertracker.repository.AuthorRepository;

import java.util.List;

@Service
public class AuthorService implements IAuthorService {

    private AuthorRepository authorRepository;

    @Autowired
    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public List<Author> findAll() {
        return authorRepository.findAll();
    }
}
