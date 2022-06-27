package com.javainuse.controller;

import com.javainuse.model.CityEntity;
import com.javainuse.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cities")
public class CityController {
    @Autowired
    private CityService cityService;

    @GetMapping("/findCitiesByCountryId/{id}")
    public List<CityEntity> findCitiesByCountryId(@PathVariable long id){
        return cityService.findCitiesByCountryId(id);
    }

    @PostMapping("/add")
    public void add(@RequestBody CityEntity cityEntity){
        cityService.add(cityEntity);
    }
}
