package com.javainuse.controller;

import com.javainuse.model.CountryEntity;
import com.javainuse.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/countries")
public class CountryController {
    @Autowired
    private CountryService countryService;

    @PostMapping("/saveCountry")
    public void saveCountry(@RequestBody CountryEntity countryEntity){
        countryService.save(countryEntity);
    }

    @GetMapping("/{id}")
    public CountryEntity findById(@PathVariable long id){
        return countryService.findById(id);
    }

    @GetMapping("/findAll")
    public List<CountryEntity> findAll(){
        return countryService.findAll();
    }
}
