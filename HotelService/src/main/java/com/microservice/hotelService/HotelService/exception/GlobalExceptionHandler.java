package com.microservice.hotelService.HotelService.exception;

import com.microservice.hotelService.HotelService.payload.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<ApiResponse>handlerResourceNotFound(ResourseNotFoundException ex){
        ApiResponse apiResponse = ApiResponse.builder().status(HttpStatus.NOT_FOUND).success(true).message(ex.getMessage()).build();
        return  new ResponseEntity<ApiResponse> (apiResponse,HttpStatus.NOT_FOUND);
    }
}
