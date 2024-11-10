package edu.icet.controller;

import edu.icet.model.Branch;
import edu.icet.service.BranchService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/branch")
@RequiredArgsConstructor
@CrossOrigin
public class BranchControlle {
    @Autowired
    final BranchService service;

    @PostMapping("/add_branch")
    public void addBranch(@RequestBody Branch branch){
        service.addBranch(branch);
    }

    @GetMapping("/search_by_branchID/{branchID}")
    public Branch searchBranchByID(@PathVariable Long branchID){
       return service.searchBranchByID(branchID);
    }

    @GetMapping("/search_by_location/{location}")
    public Branch searchBranchByLocation(@PathVariable String location){
        return service.searchBranchByLocation(location);
    }

    @GetMapping("/search_by_email/{branchEmail}")
    public Branch searchBranchByEmail(@PathVariable String branchEmail){
        return service.searchBranchByEmail(branchEmail);
    }

    @DeleteMapping("/delete_branch_by_branchID/{branchID}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteBranchByID(@PathVariable Long branchID){
        service.deleteBranchByID(branchID);
    }

    @PutMapping("/update_by_branchID")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateBranchByID(@RequestBody Branch branch){
         service.updateBranchByID(branch);
    }

    @GetMapping("/get_all")
    public List<Branch> getAll(){
        return service.getAllBranches();
    }

}
