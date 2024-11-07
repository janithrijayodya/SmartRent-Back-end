package edu.icet.controller;

import edu.icet.model.Employee;
import edu.icet.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
public class EmployeeController {

    @Autowired
    final EmployeeService service;

    @PostMapping("/add_employee")
    public void addEmployee(@RequestBody Employee employee){
        service.addEmployee(employee);
    }

    @GetMapping("/search_employee_by_id/{employeeID}")
    public Employee searchEmployeeById(@PathVariable Long employeeID){
       return service.searchEmployeeByID(employeeID);
    }

    @PutMapping("/update_employee")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateEmployee(@RequestBody Employee employee){
        service.updateEmployee(employee);
    }

    @DeleteMapping("/delete_employee_by_id/{employeeID}")
    public void deleteEmployeeByID(@PathVariable Long employeeID){
        service.deleteEmployeeByID(employeeID);
    }
}
