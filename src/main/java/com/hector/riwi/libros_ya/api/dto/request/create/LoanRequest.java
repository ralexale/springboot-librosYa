package com.hector.riwi.libros_ya.api.dto.request.create;

import java.sql.Date;

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
public class LoanRequest {

    @NotNull(message = "the loan date is required")
    private Date loanDate;

    @NotNull(message = "the loan date is required")
    private Date returnDate;

    @NotBlank(message = "the status is required")
    @Size(
        max = 20,
        message = "the status must be less than 20 characters"
    )
    private String status;
  

    @NotNull(message = "the book id is required")
    private Long bookId;

    @NotNull(message = "the user id is required")
    private Long userId;


}
