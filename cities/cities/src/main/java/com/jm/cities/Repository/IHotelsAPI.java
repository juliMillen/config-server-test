package com.jm.cities.Repository;

import com.jm.cities.DTO.HotelsDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "hotels-service")
public interface IHotelsAPI {
    @GetMapping("/hotels/{idCity}")
    List<HotelsDTO> getHotelsByCityId(@PathVariable("idCity") Long idCity);
}
