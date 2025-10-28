package com.example.BookApplication.services;

import com.example.BookApplication.dto.BookRequestDTO;
import com.example.BookApplication.dto.BookResponseDTO;

public interface BookService {

    public BookResponseDTO createBook(BookRequestDTO bookRequestDTO);
    public BookResponseDTO getBookById(Integer id);
    public BookResponseDTO getBookByName(String name);
    public BookResponseDTO updateBookById(Integer id, BookRequestDTO bookRequestDTO);
    public void deleteBookById(Integer id);
}
