package com.hector.riwi.libros_ya.infrastructure.abstract_services;

public interface UpdateService<Request, Response, Id> {

    Response update(Request request, Id id);
}