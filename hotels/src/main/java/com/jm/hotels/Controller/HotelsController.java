package com.jm.hotels.Controller;

import com.jm.hotels.Entity.Hotels;
import com.jm.hotels.Service.HotelsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelsController {

    @Autowired
    private HotelsService hotelsService;

    @GetMapping("/{idCity}")
    public ResponseEntity<List<Hotels>> getHotelsByCityId(@PathVariable Long idCity) {
        List<Hotels> listHotels = hotelsService.findHotelsByCityId(idCity);
        return new ResponseEntity<>(listHotels, HttpStatus.OK);
    }
}
