package com.hector.riwi.libros_ya.infrastructure.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.hector.riwi.libros_ya.api.dto.request.create.BookRequest;
import com.hector.riwi.libros_ya.api.dto.response.BookResponse;
import com.hector.riwi.libros_ya.domain.entities.Book;

@Mapper(componentModel = "spring", uses = { ReservationMapper.class, LoanMapper.class}) 
public interface BookMapper {


    @Mappings({
        @Mapping(target = "id", ignore = true)
    })
        Book toBook(BookRequest bookRequest);


    @Mappings({
            @Mapping(target = "reservations", source = "reservations"),
            @Mapping(target = "loans", source = "loans"),
    })
        BookResponse toBookResponse(Book book);
        

    
    @WithoutRelations
    @Mappings({
            @Mapping(target = "reservations", ignore = true),
            @Mapping(target = "loans", ignore = true),
    })
    BookResponse toBookResponseWithoutRelations(Book book);
}
