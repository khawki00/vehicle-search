package com.krashlearning.vehicle.api.search.dao;

import com.krashlearning.vehicle.api.search.entity.ManufacturerYear;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManufacturerYearDAO extends JpaRepository<ManufacturerYear, Integer> {
}
