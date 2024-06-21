package com.hector.riwi.libros_ya.api.dto.response;



import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookResponse {

    private Long id;
    private String title;
    private String author;
    private Integer publicationYear;
    private String isbn;
    private String genre;

    private List<ReservationResponse> reservations;
    private List<LoanResponse> loans;
}
