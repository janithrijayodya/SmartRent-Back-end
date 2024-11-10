package edu.icet.controller;

import edu.icet.model.Rental;
import edu.icet.service.RentalService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/rental")
@RestController
@RequiredArgsConstructor
@CrossOrigin
public class RentalController {

    @Autowired
    final RentalService service;

    @PostMapping("/add_rental")
    public void addRental(@RequestBody Rental rental){
        service.addRental(rental);
    }

    @GetMapping("/search_rental_by_id/{rentalID}")
    public Rental searchRental(@PathVariable Long rentalID){
        return service.searchRentalByID(rentalID);
    }

    @GetMapping("/search_rental_by_CustomerID/{CustomerID}")
    public Rental searchRentalByCustomerID(@PathVariable Long CustomerID){
        return service.searchRentalByCustomerID(CustomerID);
    }

    @GetMapping("/search_rental_by_VehicleID/{VehicleID}")
    public Rental searchRentalByVehicleID(@PathVariable Long VehicleID){
        return service.searchRentalByVehicleID(VehicleID);
    }

    @PutMapping("/update_rental")
    public void updateRental(@RequestBody Rental rental){
        service.updateRental(rental);
    }

    @DeleteMapping("/delete_rental_by_id/{rentalID}")
    public void deleteRental(@PathVariable Long rentalID){
        service.deleteRentalByID(rentalID);
    }

    @GetMapping("/get_all")
    public List<Rental> getAll(){
        return service.getAllRentals();
    }
}
