package com.microservice.hotelService.HotelService.service;

import com.microservice.hotelService.HotelService.entities.Hotel;

import java.util.List;

public interface HotelService {
    Hotel getHotel(int hotelId);
    List<Hotel> getHotels();

    Hotel saveHotel(Hotel hotel);
}
