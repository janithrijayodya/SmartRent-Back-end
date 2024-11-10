package edu.icet.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {
    private Long employeeID;
    private String nic;
    private String employeeName;
    private String employeeAddress;
    private String employeeContact;
    private String employeePosition;
    private Long branchID;
}
