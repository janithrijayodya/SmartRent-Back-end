package edu.icet.dao;

import edu.icet.entity.VehicleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleDao extends JpaRepository<edu.icet.entity.VehicleEntity,Long> {
    VehicleEntity findBynoPlate(String noPlate);
    VehicleEntity findByType(String type);
    VehicleEntity findByColour(String colour);
    VehicleEntity findByModel(String model);
}
