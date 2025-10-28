package com.example.BookApplication.controllers;

import com.example.BookApplication.dto.BookRequestDTO;
import com.example.BookApplication.dto.BookResponseDTO;
import com.example.BookApplication.services.BookServiceImpl;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/book")
@RequiredArgsConstructor
public class BookController {

    private final BookServiceImpl bookService;

    @PostMapping
    public ResponseEntity<BookResponseDTO> createBook(@Valid @RequestBody BookRequestDTO bookRequestDTO)
    {
        return ResponseEntity.status(HttpStatus.CREATED).body(bookService.createBook(bookRequestDTO));
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<BookResponseDTO> getBookById(@PathVariable int id)
    {
        return ResponseEntity.ok(bookService.getBookById(id));
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<BookResponseDTO> getBookByName(@PathVariable String name){
        return ResponseEntity.ok(bookService.getBookByName(name));
    }

    @PutMapping("/updateBook/{id}")
    public ResponseEntity<BookResponseDTO> updateBook(@PathVariable int id, @Valid @RequestBody BookRequestDTO bookRequestDTO)
    {
        return ResponseEntity.ok(bookService.updateBookById(id,bookRequestDTO));
    }

    @DeleteMapping("/deleteBook/{id}")
    public ResponseEntity<Void>  deleteBook(@PathVariable int id)
    {
            bookService.deleteBookById(id);
            return ResponseEntity.ok().build();
    }


}
