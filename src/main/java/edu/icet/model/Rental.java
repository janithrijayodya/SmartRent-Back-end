package edu.icet.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Rental {
    private Long rentalID;
    private Integer noOfDays;
    private LocalDate pickUpDate;
    private LocalDate dropOffDate;
    private Long vehicleID;
    private Long customerID;
}
