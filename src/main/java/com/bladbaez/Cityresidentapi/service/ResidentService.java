package com.bladbaez.Cityresidentapi.service;
import com.bladbaez.Cityresidentapi.model.Resident;

import java.util.ArrayList;
import java.util.Optional;

public interface ResidentService {
    ArrayList<Resident> getAllResidents();
    Optional<Resident> getResidentById(long id);
    Resident saveResident(Resident r);
    boolean deleteResident(long id);
}
