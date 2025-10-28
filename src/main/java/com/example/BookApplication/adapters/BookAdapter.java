package com.example.BookApplication.adapters;

import com.example.BookApplication.dto.BookRequestDTO;
import com.example.BookApplication.dto.BookResponseDTO;
import com.example.BookApplication.models.Book;

public class BookAdapter {

    public static Book toEntity(BookRequestDTO bookRequestDTO)
    {
        return Book.builder()
                .author(bookRequestDTO.getAuthor())
                .name(bookRequestDTO.getName())
                .genre(bookRequestDTO.getGenre())
                .build();
    }

    public static BookResponseDTO toDTO(Book book)
    {
        return BookResponseDTO.builder()
                .id(book.getId())
                .author(book.getAuthor())
                .name(book.getName())
                .genre(book.getGenre())
                .createdAt(book.getCreatedAt())
                .build();

    }
}
