package com.hector.riwi.libros_ya.api.dto.request.create;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookRequest {


    @NotBlank(message = "the title is required")
    @Size(
        max = 100,
        message = "the title must be less than 100 characters"
    )
    private String title;

    @NotBlank(message = "the author is required")
    @Size(
        max = 100,
        message = "the author must be less than 100 characters"
    )
    private String author;


    @NotNull(message = "the publication year is required")
    private Integer publicationYear;


    @NotBlank(message = "the genre is required")
    @Size(
        max = 50,
        message = "the genre must be less than 50 characters"
    )
    private String genre;

    @NotBlank(message = "the isbn is required")
    @Size(
        max = 20,
        message = "the isbn must be less than 20 characters"
    )
    private String isbn;
}
