package com.bladbaez.Cityresidentapi.controller;

import com.bladbaez.Cityresidentapi.model.Resident;
import com.bladbaez.Cityresidentapi.service.ResidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class Api {
    @Autowired
    ResidentService residentService;

    @GetMapping("/test")
    public String testing(){
        return "Hello residents!";
    }

    @GetMapping("/all")
    public ArrayList<Resident> getAllResidents(){
        return residentService.getAllResidents();
    }

    @GetMapping("/find/{id}")
    public Optional<Resident> getResidentById(@PathVariable("id") long id){
        return residentService.getResidentById(id);
    }

    @PostMapping("/save")
    public Resident saveResident(@RequestBody Resident r){
        return residentService.saveResident(r);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteResidentById(@PathVariable("id") long id){
        if(residentService.deleteResident(id)) {
            return "The resident has been deleted.";
        } else {
            return "Couldn't delete this resident!";
        }
    }



}
