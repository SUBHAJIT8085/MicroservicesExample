package com.microservice.hotelService.HotelService.service;

import com.microservice.hotelService.HotelService.entities.Hotel;
import com.microservice.hotelService.HotelService.exception.ResourseNotFoundException;
import com.microservice.hotelService.HotelService.repo.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HotelServiceImpl implements HotelService{
    @Autowired
    private HotelRepository hotelrepository;
    @Override
    public Hotel getHotel(int hotelId) {
        return hotelrepository.findById(hotelId).orElseThrow(()->new ResourseNotFoundException());
    }

    @Override
    public List<Hotel> getHotels() {
        return hotelrepository.findAll();
    }

    @Override
    public Hotel saveHotel(Hotel hotel) {
        return hotelrepository.save(hotel);
    }
}
