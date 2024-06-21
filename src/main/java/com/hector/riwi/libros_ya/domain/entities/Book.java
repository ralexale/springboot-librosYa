package com.hector.riwi.libros_ya.domain.entities;



import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Book {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "BIGINT(20)")
    private Long id;

    @Column(length = 100)
    private String title;

    @Column(length = 100)
    private String author;
    
    @Column(columnDefinition = "INT(11)", name = "publication_year")
    private Integer publicationYear;

    @Column(length = 50)
    private String genre;

    @Column(length = 20)
    private String isbn;

    @OneToMany(mappedBy = "bookId" , cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    private Set<Loan> loans = new HashSet<>(); 

    @OneToMany(mappedBy = "bookId" , cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    private Set<Reservation> reservations = new HashSet<>();
}
