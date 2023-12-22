package com.microservice.hotelService.HotelService.exception;

public class ResourseNotFoundException extends RuntimeException {

    public ResourseNotFoundException(String message) {
      super(message);
    }

    public ResourseNotFoundException() {
        super("Resource Not found");
    }
}
