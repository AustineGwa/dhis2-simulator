package com.gwazasoftwares.dhis2simulator.controllers;

import com.gwazasoftwares.dhis2simulator.dbs.FacilitiesRepository;
import com.gwazasoftwares.dhis2simulator.models.HealthFacility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class FacilitiesController {

    @Autowired
    private FacilitiesRepository facilitiesRepository;

    @GetMapping("/facilities")
    public List<HealthFacility> getAllFacilities(){
        return  facilitiesRepository.findAll();
    }

    @PostMapping("/facilities")
    public String postData(@RequestBody HealthFacility healthFacility){
        facilitiesRepository.save(healthFacility);
        return  "success";
    }



}
