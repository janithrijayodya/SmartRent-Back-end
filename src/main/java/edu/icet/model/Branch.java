package edu.icet.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Branch {
    private Long branchID;
    private String location;
    private String address;
    private String branchEmail;
    private String branchContact;
    private String password;
}
