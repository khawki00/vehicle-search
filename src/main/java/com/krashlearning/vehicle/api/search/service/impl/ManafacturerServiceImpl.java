package com.krashlearning.vehicle.api.search.service.impl;

import com.krashlearning.vehicle.api.search.dao.ManufacturerDAO;
import com.krashlearning.vehicle.api.search.entity.Manufacturer;
import com.krashlearning.vehicle.api.search.service.ManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManafacturerServiceImpl implements ManufacturerService {
    @Autowired
    private ManufacturerDAO manufacturerDAO;
    @Override
    public Manufacturer saveManufacturer(Manufacturer manufacturer) {
        return manufacturerDAO.save(manufacturer);
    }
}
