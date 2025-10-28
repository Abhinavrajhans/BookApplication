package com.example.BookApplication.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookResponseDTO {
    private int id;
    private String name;
    private String author;
    private String genre;
    private LocalDateTime createdAt;
}
