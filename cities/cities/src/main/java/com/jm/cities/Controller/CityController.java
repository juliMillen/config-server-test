package com.jm.cities.Controller;

import com.jm.cities.DTO.CityDTO;
import com.jm.cities.Service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/city")
public class CityController {

    @Autowired
    private CityService cityService;

    @GetMapping("/hotels")
    public ResponseEntity<CityDTO> getCitiesHotels(@RequestParam String name, @RequestParam String country){
        CityDTO dto = cityService.getCitiesHotels(name,country);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }
}
