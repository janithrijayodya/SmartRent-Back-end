package edu.icet.dao;

import edu.icet.entity.BranchEntity;
import edu.icet.model.Branch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BranchDao extends JpaRepository<edu.icet.entity.BranchEntity,Long> {
    BranchEntity findByLocation(String location);
    BranchEntity findByBranchEmail(String branchEmail);
}
