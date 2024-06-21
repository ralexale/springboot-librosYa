package com.hector.riwi.libros_ya.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hector.riwi.libros_ya.domain.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
