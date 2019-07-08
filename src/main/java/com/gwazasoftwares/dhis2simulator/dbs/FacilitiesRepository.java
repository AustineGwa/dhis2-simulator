package com.gwazasoftwares.dhis2simulator.dbs;

import com.gwazasoftwares.dhis2simulator.models.HealthFacility;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacilitiesRepository extends JpaRepository<HealthFacility, String> {
}
