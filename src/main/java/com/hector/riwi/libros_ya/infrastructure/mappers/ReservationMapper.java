package com.hector.riwi.libros_ya.infrastructure.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.hector.riwi.libros_ya.api.dto.request.create.ReservationRequest;
import com.hector.riwi.libros_ya.api.dto.response.ReservationResponse;
import com.hector.riwi.libros_ya.domain.entities.Reservation;

@Mapper(componentModel = "spring", uses = { UserMapper.class, BookMapper.class})
public interface ReservationMapper {


    @Mappings({
        @Mapping(target = "id", ignore = true),
        @Mapping(target = "userId.id", source = "userId"),
        @Mapping(target = "bookId.id", source = "bookId")
    })
    Reservation topResevation(ReservationRequest reservationRequest);

    @Mappings({
        @Mapping(target = "user", source = "userId"),
        @Mapping(target = "book", source = "bookId")
    })
    ReservationResponse toReservationResponse(Reservation reservation);

    @WithoutRelations
    @Mappings({
        @Mapping(target = "user", ignore = true),
        @Mapping(target = "book", ignore = true),
    })
    ReservationResponse toReservationResponseWithoutRelations(Reservation reservation);
}
