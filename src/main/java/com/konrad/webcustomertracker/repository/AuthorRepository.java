package com.konrad.webcustomertracker.repository;

import com.konrad.webcustomertracker.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AuthorRepository extends JpaRepository<Author, Long> {
}
