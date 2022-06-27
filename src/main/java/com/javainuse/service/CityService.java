package com.javainuse.service;

import com.javainuse.model.CityEntity;
import com.javainuse.repository.CityRepo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Service
public class CityService implements ICityService{
    @Autowired
    private CityRepo cityRepo;

    @Override
    public CityEntity findById(long id) {
        return cityRepo.findById(id);
    }
    @Override
    public List<CityEntity> findCitiesByCountryId(long id) {
        return cityRepo.findCityEntitiesByCountryEntity_Id(id);
    }

    public void add(CityEntity cityEntity) {
        cityRepo.save(cityEntity);
    }

}

