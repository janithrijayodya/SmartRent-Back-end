package edu.icet.controller;

import edu.icet.model.Customer;
import edu.icet.model.DailyContact;
import edu.icet.service.CustomerService;
import edu.icet.service.DailyContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dailyContact")
@RequiredArgsConstructor
@CrossOrigin
public class DailyContactController {
    @Autowired
    final DailyContactService dailyContactService;

    @PostMapping("/add_contact")
    public void addCustomer(@RequestBody DailyContact dailyContact){
        dailyContactService.addContact(dailyContact);
    }

    @DeleteMapping("/delete_by_id/{dailyContactID}")
    public void deleteCustomer(@PathVariable Long dailyContactID){
        dailyContactService.deleteContactByID(dailyContactID);
    }

    @GetMapping("/get_all")
    public List<DailyContact> getAll(){
        return dailyContactService.getAllContact();
    }
}
