package edu.icet.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="dailyContact")
public class DailyContactEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dailyContactID;
    private String name;
    private String contact;
    private String DrivingLicenseNumber;
    private String vehicleID;
}
