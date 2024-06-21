package com.hector.riwi.libros_ya.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hector.riwi.libros_ya.domain.entities.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
