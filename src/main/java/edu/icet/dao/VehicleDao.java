package edu.icet.dao;

import edu.icet.entity.VehicleEntity;
import edu.icet.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VehicleDao extends JpaRepository<edu.icet.entity.VehicleEntity,Long> {
    VehicleEntity findBynoPlate(String noPlate);
    List<VehicleEntity> findByType(String type);
    List<VehicleEntity> findByColour(String colour);
    List<VehicleEntity> findByModel(String model);
}
