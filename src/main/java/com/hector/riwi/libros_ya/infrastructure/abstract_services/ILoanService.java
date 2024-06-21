package com.hector.riwi.libros_ya.infrastructure.abstract_services;

import com.hector.riwi.libros_ya.api.dto.request.create.LoanRequest;
import com.hector.riwi.libros_ya.api.dto.response.LoanResponse;


public interface ILoanService extends CreateDeleteReadService<LoanRequest, LoanResponse, Long> { 

}
