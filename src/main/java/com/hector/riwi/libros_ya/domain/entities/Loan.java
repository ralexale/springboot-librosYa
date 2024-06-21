package com.hector.riwi.libros_ya.domain.entities;

import java.sql.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "BIGINT(20)")
    private Long id;

    @Column(name = "loan_date")
    private Date loanDate;

    @Column(name = "return_date")
    private Date returnDate;

    private String status;

    @ManyToOne( fetch =  FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User userId;

    
    @ManyToOne( fetch =  FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "book_id")
    private Book bookId;
}
