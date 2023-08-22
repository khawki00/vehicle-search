package com.krashlearning.vehicle.api.search.service;

import com.krashlearning.vehicle.api.search.entity.Manufacturer;

import java.util.List;

public interface ManufacturerService {
    Manufacturer saveManufacturer(Manufacturer manufacturer);
    List<Manufacturer> fetchAllManufacturers();
}
