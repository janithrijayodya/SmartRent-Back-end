package edu.icet.dao;

import edu.icet.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDao extends JpaRepository<edu.icet.entity.CustomerEntity,Long> {
    CustomerEntity findByDLNumber(String DLNumber);
}
