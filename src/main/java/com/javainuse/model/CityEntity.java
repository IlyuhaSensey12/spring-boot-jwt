package com.javainuse.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;


@Data
@RequiredArgsConstructor
@Entity(name = "cities")
@Table(name = "cities")
public class CityEntity {
    @Id
    private long id;
    private String name;

    @ManyToOne
    private CountryEntity countryEntity;
}
