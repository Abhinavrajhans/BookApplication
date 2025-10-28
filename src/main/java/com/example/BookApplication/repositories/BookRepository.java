package com.example.BookApplication.repositories;

import com.example.BookApplication.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {
    Book findBookByName(String name);
}
