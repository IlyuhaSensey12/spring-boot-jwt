package com.javainuse.repository;

import com.javainuse.model.CityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepo extends JpaRepository<CityEntity, Long> {
    List<CityEntity> findCityEntitiesByCountryEntity_Id(long id);
    CityEntity findById(long id);
}
