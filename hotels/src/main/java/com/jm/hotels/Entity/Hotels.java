package com.jm.hotels.Entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Hotels {


    private Long idHotels;

    private String name;

    private int amountStars;

    private Long idCity;


}
