package edu.icet.controller;

import edu.icet.model.Rental;
import edu.icet.model.Vehicle;
import edu.icet.service.VehicleService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/vehicle")
@CrossOrigin
public class VehicleController {

    @Autowired
    final VehicleService service;

    @PostMapping("/add_vehicle")
    public void addVehicle(@RequestBody Vehicle vehicle){
        service.addVehicle(vehicle);
    }

    @GetMapping("/search_vehicle_by_id/{vehicleID}")
    public Vehicle searchVehicle(@PathVariable Long vehicleID){
        return service.searchVehicleByID(vehicleID);
    }

    @GetMapping("/search_vehicle_by_noPlate/{noPlate}")
    public Vehicle searchVehicleByNoPlate(@PathVariable String noPlate){
        return service.searchVehicleByNoPlate(noPlate);
    }

    @GetMapping("/search_vehicle_by_type/{type}")
    public List<Vehicle> searchVehicleByType(@PathVariable String type){
        return service.searchVehicleByType(type);
    }

    @GetMapping("/search_vehicle_by_colour/{colour}")
    public List<Vehicle> searchVehicleByColour(@PathVariable String colour){
        return service.searchVehicleByColour(colour);
    }

    @GetMapping("/search_vehicle_by_model/{model}")
    public List<Vehicle> searchVehicleByModel(@PathVariable String model){
        return service.searchVehicleByModel(model);
    }

    @PutMapping("/update_vehicle")
    public void updateVehicle(@RequestBody Vehicle vehicle){
        service.updateVehicle(vehicle);
    }

    @DeleteMapping("/delete_vehicle_by_id/{vehicleID}")
    public void deleteVehicle(@PathVariable Long vehicleID){
        service.deleteVehicleByID(vehicleID);
    }

    @GetMapping("/get_all")
    public List<Vehicle> getAll(){
        return service.getAllVehicles();
    }
}
