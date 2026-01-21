package com.jm.cities.DTO;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CityDTO {

    private Long idCity;
    private String name;
    private String continent;
    private String country;
    private String state;
    private List<HotelsDTO> hotelList;
}
