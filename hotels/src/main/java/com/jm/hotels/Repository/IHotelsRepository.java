package com.jm.hotels.Repository;

import com.jm.hotels.Entity.Hotels;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IHotelsRepository {

    List<Hotels> findHotelsByCityId(Long idCity);
}
