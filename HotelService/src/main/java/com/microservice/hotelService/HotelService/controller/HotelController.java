package com.microservice.hotelService.HotelService.controller;

import com.microservice.hotelService.HotelService.entities.Hotel;
import com.microservice.hotelService.HotelService.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/hotels")
public class HotelController {
    @Autowired
    private HotelService hotelService;

    @GetMapping("/{hotelId}")
    public ResponseEntity<Hotel> getHotel(@PathVariable int hotelId){
       return ResponseEntity.status(HttpStatus.OK).body( hotelService.getHotel(hotelId));
    }

    @GetMapping
    public ResponseEntity<List<Hotel>> getHotels(){
        return ResponseEntity.status(HttpStatus.OK).body(hotelService.getHotels());
    }

    @PostMapping
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
        Hotel h = hotelService.saveHotel(hotel);
        return ResponseEntity.status(HttpStatus.CREATED).body(h);
    }
}
