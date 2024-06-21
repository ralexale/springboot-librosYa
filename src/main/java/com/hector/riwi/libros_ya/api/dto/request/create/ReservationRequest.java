package com.hector.riwi.libros_ya.api.dto.request.create;

import java.sql.Date;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReservationRequest {

    @NotNull(message = "the reservation date is required")
    private Date reservationDate; 


    @NotNull(message = "the status is required")
    private String status;


    private Long bookId;
    private Long userId;
}
