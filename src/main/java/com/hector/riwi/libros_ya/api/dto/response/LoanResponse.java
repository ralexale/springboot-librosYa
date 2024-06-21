package com.hector.riwi.libros_ya.api.dto.response;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LoanResponse {

    private Long id;
    private Date loanDate;
    private String status;

    private UserResponse user;
    private BookResponse book;
}
