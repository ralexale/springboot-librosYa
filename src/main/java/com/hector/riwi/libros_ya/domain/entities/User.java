package com.hector.riwi.libros_ya.domain.entities;



import java.util.Set;

import com.hector.riwi.libros_ya.util.enums.Role;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "BIGINT(20)")
    private Long id;

    private String username;
    private String password;
    private String email;
    private String fullname;

    @Enumerated(EnumType.STRING)
    private Role role;

    @OneToMany(mappedBy = "userId", cascade = CascadeType.ALL, fetch =  FetchType.EAGER, orphanRemoval = false)
    private Set<Reservation> reservations;
}
