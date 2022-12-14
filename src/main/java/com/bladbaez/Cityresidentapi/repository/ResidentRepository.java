package com.bladbaez.Cityresidentapi.repository;

import com.bladbaez.Cityresidentapi.model.Resident;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResidentRepository extends CrudRepository<Resident,Long> {
}
