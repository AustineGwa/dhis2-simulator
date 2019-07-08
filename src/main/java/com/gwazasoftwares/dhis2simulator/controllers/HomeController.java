package com.gwazasoftwares.dhis2simulator.controllers;

import com.gwazasoftwares.dhis2simulator.dbs.FacilitiesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @Autowired
    private FacilitiesRepository facilitiesRepository;

    @GetMapping("/index")
    public ModelAndView showIndex(){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("facilities", facilitiesRepository.findAll());

        return modelAndView;
    }
}
