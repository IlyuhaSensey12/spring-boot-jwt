package com.javainuse.service;

import com.javainuse.model.CountryEntity;
import com.javainuse.repository.CountryRepo;
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
public class CountryService implements ICountryService{
    @Autowired
    private CountryRepo countryRepo;

    @Override
    public CountryEntity findById(long id) {
        return countryRepo.findById(id);
    }

    @Override
    public List<CountryEntity> findAll() {
        return countryRepo.findAll();
    }
    @Override
    public void save(CountryEntity countryEntity) {
        countryRepo.save(countryEntity);
    }
}
