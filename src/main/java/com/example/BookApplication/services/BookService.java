package com.example.BookApplication.services;

import com.example.BookApplication.adapters.BookAdapter;
import com.example.BookApplication.dto.BookRequestDTO;
import com.example.BookApplication.dto.BookResponseDTO;
import com.example.BookApplication.repositories.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public BookResponseDTO createBook(BookRequestDTO bookRequestDTO)
    {
        return BookAdapter.toDTO(bookRepository.save(BookAdapter.toEntity(bookRequestDTO)));
    }
}
