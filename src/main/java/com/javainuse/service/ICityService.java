package com.javainuse.service;

import com.javainuse.model.CityEntity;

import java.util.List;

public interface ICityService {
    CityEntity findById(long id);
    List<CityEntity> findCitiesByCountryId(long id);
}
