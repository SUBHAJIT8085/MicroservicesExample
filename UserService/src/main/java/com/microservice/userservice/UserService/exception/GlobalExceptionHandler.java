package com.microservice.userservice.UserService.exception;

import com.microservice.userservice.UserService.payload.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<ApiResponse> handlerResourceNotFoundException(ResourceNotFoundException ex){
       ApiResponse response = ApiResponse.builder().message(ex.getMessage()).success(true).status(HttpStatus.NOT_FOUND).build();
       return  new ResponseEntity<ApiResponse>(response,HttpStatus.NOT_FOUND);
    }
}
