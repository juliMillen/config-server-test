package com.jm.hotels.Service;

import com.jm.hotels.Entity.Hotels;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HotelsService {

    List<Hotels> hotelsList = new ArrayList<Hotels>();

    public List<Hotels>  findHotelsByCityId(Long idCity){

        List<Hotels> hotels=new ArrayList<>();

        //cargamos una bd logica
        this.loadHotels();

        //busco coincidencia de id

        for(Hotels h: hotelsList){
            if(h.getIdCity().equals(idCity)){
                hotels.add(h);
            }
        }
        return hotels;
    }

    private void loadHotels() {
        hotelsList.add(new Hotels(1L,"Paradise",5,1L));
        hotelsList.add(new Hotels(2L,"Sunset View",4,2L));
        hotelsList.add(new Hotels(3L,"Ocean Breeze",3,3L));
        hotelsList.add(new Hotels(4L,"Mountaint Retreat",4,1L));
        hotelsList.add(new Hotels(5L,"City Lights Inn",3,2L));
        hotelsList.add(new Hotels(6L,"Riverside Lodge",4,3L));
        hotelsList.add(new Hotels(7L,"Cozy Cabin Rezort",2,1L));
        hotelsList.add(new Hotels(8L,"Luxury Haven",5,2L));
        hotelsList.add(new Hotels(9L,"Historic Grand Hotel",4,3L));
        hotelsList.add(new Hotels(10L,"Tranquil Gardens",3,1L));
    }
}
