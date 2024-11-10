package edu.icet.service;


import edu.icet.model.Employee;

import java.util.List;

public interface EmployeeService {
    void addEmployee(Employee employee);
    void deleteEmployeeByID(Long employeeID);
    Employee searchEmployeeByID(Long employeeID);
    void updateEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Employee searchEmployeeByNIC(String nic);
}
