package com.hector.riwi.libros_ya.infrastructure.abstract_services;

import com.hector.riwi.libros_ya.api.dto.request.create.BookRequest;
import com.hector.riwi.libros_ya.api.dto.response.BookResponse;

public interface IBookService extends CreateDeleteReadService<BookRequest, BookResponse, Long> {

}
