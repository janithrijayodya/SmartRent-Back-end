package edu.icet.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DailyContact {
    private Long dailyContactID;
    private String name;
    private String contact;
    private String DrivingLicenseNumber;
    private String vehicleID;
}
