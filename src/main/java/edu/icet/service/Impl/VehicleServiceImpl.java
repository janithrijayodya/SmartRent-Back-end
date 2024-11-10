package edu.icet.service.Impl;

import edu.icet.dao.VehicleDao;
import edu.icet.entity.VehicleEntity;
import edu.icet.model.Vehicle;
import edu.icet.service.VehicleService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class VehicleServiceImpl implements VehicleService {
    final VehicleDao vehicleDao;
    final ModelMapper mapper;

    @Override
    public void addVehicle(Vehicle vehicle) {
       vehicleDao.save(mapper.map(vehicle, VehicleEntity.class));
    }

    @Override
    public void deleteVehicleByID(Long vehicleID) {
        vehicleDao.deleteById(vehicleID);
    }

    @Override
    public Vehicle searchVehicleByID(Long vehicleID) {
        return mapper.map(vehicleDao.findById(vehicleID),Vehicle.class);
    }

    @Override
    public void updateVehicle(Vehicle vehicle) {
        vehicleDao.save(mapper.map(vehicle,VehicleEntity.class));
    }

    @Override
    public List<Vehicle> getAllVehicles() {
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleDao.findAll().forEach(vehicleEntity -> {
            vehicleList.add(mapper.map(vehicleEntity,Vehicle.class));
        });
        return vehicleList;
    }

    @Override
    public Vehicle searchVehicleByNoPlate(String noPlate) {
        return mapper.map(vehicleDao.findBynoPlate(noPlate), Vehicle.class);
    }

    @Override
    public List<Vehicle> searchVehicleByType(String type) {
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleDao.findByType(type).forEach(vehicleEntity -> {
            vehicleList.add(mapper.map(vehicleEntity,Vehicle.class));
        });
        return vehicleList;
    }

    @Override
    public List<Vehicle> searchVehicleByColour(String colour) {
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleDao.findByColour(colour).forEach(vehicleEntity -> {
            vehicleList.add(mapper.map(vehicleEntity,Vehicle.class));
        });
        return vehicleList;
    }

    @Override
    public List<Vehicle> searchVehicleByModel(String model) {
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleDao.findByModel(model).forEach(vehicleEntity -> {
            vehicleList.add(mapper.map(vehicleEntity,Vehicle.class));
        });
        return vehicleList;
    }
}
