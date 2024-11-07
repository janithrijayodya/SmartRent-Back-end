package edu.icet.dao;

import edu.icet.entity.RentalEntity;
import edu.icet.model.Rental;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalDao extends JpaRepository<edu.icet.entity.RentalEntity,Long> {
    RentalEntity findByCustomerID(Long customerID);
    RentalEntity findByVehicleID(Long VehicleID);
}
