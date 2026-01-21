package com.jm.hotels.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class HotelsDTO {

    private Long idHotels;

    private String name;

    private String amountStars;

    private Long idCity;
}
