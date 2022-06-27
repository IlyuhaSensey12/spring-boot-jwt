package com.javainuse.service;

import com.javainuse.model.CountryEntity;

import java.util.List;

public interface ICountryService{
    CountryEntity findById(long id);

    List<CountryEntity> findAll();
    void save(CountryEntity countryEntity);
}
