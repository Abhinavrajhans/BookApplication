package com.example.BookApplication.services;

import com.example.BookApplication.adapters.BookAdapter;
import com.example.BookApplication.dto.BookRequestDTO;
import com.example.BookApplication.dto.BookResponseDTO;
import com.example.BookApplication.models.Book;
import com.example.BookApplication.repositories.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    public BookResponseDTO createBook(BookRequestDTO bookRequestDTO)
    {
        return BookAdapter.toDTO(bookRepository.save(BookAdapter.toEntity(bookRequestDTO)));
    }

    @Override
    public BookResponseDTO getBookById(Integer id)
    {
        return BookAdapter.toDTO(bookRepository.findById(id).orElseThrow(()-> new RuntimeException("Book Not Found")));
    }

    @Override
    public BookResponseDTO getBookByName(String name){
        return BookAdapter.toDTO(bookRepository.findBookByName(name));
    }

    @Override
    public BookResponseDTO updateBookById(Integer id, BookRequestDTO bookRequestDTO)
    {
        Book book= bookRepository.findById(id).orElseThrow(()-> new RuntimeException("Book Not Found"));
        book.setName(bookRequestDTO.getName());
        book.setAuthor(bookRequestDTO.getAuthor());
        book.setGenre(bookRequestDTO.getGenre());
        return BookAdapter.toDTO(bookRepository.save(book));
    }

    @Override
    public void deleteBookById(Integer id)
    {
        bookRepository.deleteById(id);
    }
}
