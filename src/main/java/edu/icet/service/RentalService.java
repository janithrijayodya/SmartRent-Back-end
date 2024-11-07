package edu.icet.service;

import edu.icet.model.Rental;

import java.util.List;

public interface RentalService {
    void addRental(Rental rental);
    void deleteRentalByID(Long rentalID);
    Rental searchRentalByID(Long rentalID);
    void updateRental(Rental rental);
    List<Rental> getAllRentals();
    Rental searchRentalByCustomerID(Long customerID);
    Rental searchRentalByVehicleID(Long VehicleID);
}
