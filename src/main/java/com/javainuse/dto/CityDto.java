package com.javainuse.dto;

import lombok.Data;

@Data
public class CityDto {
    private long id;
    private String name;
    private CountryDto countryDto;

}
