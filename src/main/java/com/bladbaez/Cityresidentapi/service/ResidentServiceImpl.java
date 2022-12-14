package com.bladbaez.Cityresidentapi.service;
import com.bladbaez.Cityresidentapi.model.Resident;
import com.bladbaez.Cityresidentapi.repository.ResidentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ResidentServiceImpl implements ResidentService{

    @Autowired
    ResidentRepository residentRepository;

    @Override
    public ArrayList<Resident> getAllResidents() {
        return (ArrayList<Resident>) residentRepository.findAll();
    }

    @Override
    public Optional<Resident> getResidentById(long id) {
        return residentRepository.findById(id);
    }

    @Override
    public Resident saveResident(Resident r) {
        return residentRepository.save(r);
    }

    @Override
    public boolean deleteResident(long id) {
        try{
          Optional<Resident> r = getResidentById(id);
          residentRepository.delete(r.get());
          return true;
        }catch (Exception e){
            return false;
        }
    }
}
