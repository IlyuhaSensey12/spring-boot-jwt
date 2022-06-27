package com.javainuse.repository;

import com.javainuse.model.CountryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepo extends JpaRepository<CountryEntity, Long> {
    CountryEntity findById(long id);
}
