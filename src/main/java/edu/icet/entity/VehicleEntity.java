package edu.icet.entity;

import edu.icet.model.Branch;
import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="vehicle")
public class VehicleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vehicleID;
    private String noPlate;
    private String model;
    private Integer year;
    private String colour;
    private String type;
    private String description;
    private Double rentalPrice;
    private String status;

    @ManyToOne
    @NonNull
    @JoinColumn(name="branchID",referencedColumnName = "branchID")
    private BranchEntity branch;
//    private Long branchID;

}
