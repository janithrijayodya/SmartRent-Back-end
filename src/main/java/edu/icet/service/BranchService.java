package edu.icet.service;

import edu.icet.model.Branch;

import java.util.List;

public interface BranchService {
    void addBranch(Branch branch);
    void deleteBranchByID(Long branchID);
    Branch searchBranchByID(Long branchID);
    Branch searchBranchByLocation(String location);
    void updateBranchByID(Branch branch);
    List<Branch> getAllBranches();
    Branch searchBranchByEmail(String branchEmail);
}
