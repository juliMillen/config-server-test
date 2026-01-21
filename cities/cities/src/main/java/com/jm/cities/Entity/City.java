package com.jm.cities.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class City {


    private Long idCity;

    private String name;

    private String continent;

    private String country;

    private String state;

}
