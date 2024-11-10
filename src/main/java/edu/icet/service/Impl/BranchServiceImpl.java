package edu.icet.service.Impl;

import edu.icet.dao.BranchDao;
import edu.icet.entity.BranchEntity;
import edu.icet.entity.CustomerEntity;
import edu.icet.model.Branch;
import edu.icet.service.BranchService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BranchServiceImpl  implements BranchService {

    private final BranchDao branchDao;
    private final ModelMapper mapper;

    @Override
    public void addBranch(Branch branch) {
        BranchEntity map = mapper.map(branch, BranchEntity.class);
        branchDao.save(map);
    }

    @Override
    public void deleteBranchByID(Long branchID) {
        branchDao.deleteById(branchID);
    }

    @Override
    public Branch searchBranchByID(Long branchID) {
        return  mapper.map(branchDao.findById(branchID), Branch.class);
    }

    @Override
    public Branch searchBranchByLocation(String location) {
       return mapper.map(branchDao.findByLocation(location), Branch.class);
    }

    @Override
    public void updateBranchByID(Branch branch) {
        branchDao.save(mapper.map(branch,BranchEntity.class));
    }

    @Override
    public List<Branch> getAllBranches() {
        List<Branch> branchArrayList = new ArrayList<>();
        branchDao.findAll().forEach(entity->{
            branchArrayList.add(mapper.map(entity, Branch.class));
        });
        return branchArrayList;
    }

    @Override
    public Branch searchBranchByEmail(String branchEmail) {
       return mapper.map(branchDao.findByBranchEmail(branchEmail),Branch.class);
    }
}
