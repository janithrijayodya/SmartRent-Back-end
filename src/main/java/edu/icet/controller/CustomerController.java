package edu.icet.controller;

import edu.icet.model.Customer;
import edu.icet.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
@CrossOrigin
public class CustomerController {

    @Autowired
    final CustomerService service;

    @PostMapping("add_customer")
    public void addCustomer(@RequestBody Customer customer){
        service.addCustomer(customer);
    }

    @GetMapping("/search_customer/{customerID}")
    public Customer searchCustomer(@PathVariable Long customerID){
        return service.searchCustomerByID(customerID);
    }

//    ============== NOT WORKING============
    @GetMapping("/search_customer_by_DLNumber/{DLNumber}")
    public Customer searchCustomerByDLNumber(@PathVariable String DLNumber){
        return service.searchCustomerByDLicense(DLNumber);
    }

    @PutMapping("/update_customer")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateCustomer(@RequestBody Customer customer){
        service.updateCustomer(customer);
    }

    @DeleteMapping("/delete_by_id/{customerID}")
    public void deleteCustomer(@PathVariable Long customerID){
        service.deleteCustomerByID(customerID);
    }

    @GetMapping("/get_all")
    public List<Customer> getAll(){
        return service.getAllCustomers();
    }

}
