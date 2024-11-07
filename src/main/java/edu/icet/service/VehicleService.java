package edu.icet.service;


import edu.icet.model.Vehicle;

import java.util.List;

public interface VehicleService {
    void addVehicle(Vehicle vehicle);
    void deleteVehicleByID(Long vehicleID);
    Vehicle searchVehicleByID(Long vehicleID);
    void updateVehicle(Vehicle vehicle);
    List<Vehicle> getAllVehicles();
}
