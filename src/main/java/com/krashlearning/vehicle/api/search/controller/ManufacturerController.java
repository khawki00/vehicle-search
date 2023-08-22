package com.krashlearning.vehicle.api.search.controller;

import com.krashlearning.vehicle.api.search.entity.Manufacturer;
import com.krashlearning.vehicle.api.search.service.ManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/manufacturers")
public class ManufacturerController {

    @Autowired
    private ManufacturerService manufactureService;
    @PostMapping
    public ResponseEntity<Manufacturer> createManufacturerInDB(@RequestBody Manufacturer manufacturer){
       Manufacturer dbRecord =  manufactureService.saveManufacturer(manufacturer);
       return new ResponseEntity<>(dbRecord, HttpStatus.CREATED);

    }

    @GetMapping
    public ResponseEntity<List<Manufacturer>> getAllManufacturers(){
        List<Manufacturer> savedManufacturers = manufactureService.fetchAllManufacturers();
        return ResponseEntity.status(HttpStatus.OK).body(savedManufacturers);

    }

}
