package com.hector.riwi.libros_ya.infrastructure.abstract_services;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CreateDeleteReadService<Request, Response, Id> {
    Response create(Request request);
    void delete(Id id);
    Page<Response> getAll(Pageable pageable);
    Optional<Response> getById(Id id);
}
