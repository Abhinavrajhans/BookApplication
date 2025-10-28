package com.example.BookApplication.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookRequestDTO {

    @NotBlank(message="name is Required")
    private String name;

    @NotBlank(message="name is Required")
    private String author;

    @NotBlank(message="name is Required")
    private String genre;
}
