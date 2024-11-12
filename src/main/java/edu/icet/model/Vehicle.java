package edu.icet.model;

import edu.icet.dao.BranchDao;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Vehicle {
    private Long vehicleID;
    private String noPlate;
    private String model;
    private Integer year;
    private String colour;
    private String type;
    private String description;
    private Double rentalPrice;
    private String status;
//    private Long branchID;
    private Branch branchDao;
}

