package com.hector.riwi.libros_ya.infrastructure.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.hector.riwi.libros_ya.api.dto.request.create.LoanRequest;
import com.hector.riwi.libros_ya.api.dto.response.LoanResponse;
import com.hector.riwi.libros_ya.domain.entities.Loan;

@Mapper(componentModel = "spring", uses = { BookMapper.class, UserMapper.class})
public interface LoanMapper {

    @Mappings({
        @Mapping(target = "id", ignore = true),
        @Mapping(target = "userId.id", source = "userId"),
        @Mapping(target = "bookId.id", source = "bookId")
    })
    Loan toLoan(LoanRequest loanRequest);


    @Mappings({
        @Mapping(target = "user", source = "userId"),
        @Mapping(target = "book", source = "bookId")
    })
    LoanResponse toLoanResponse(Loan loan);

    @WithoutRelations
    @Mappings({
        @Mapping(target = "user", ignore = true),
        @Mapping(target = "book", ignore = true),
    })
    LoanResponse toLoanResponseWithoutRelations(Loan loan);
}
