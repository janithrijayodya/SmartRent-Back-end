package edu.icet.dao;

import edu.icet.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends JpaRepository<edu.icet.entity.EmployeeEntity,Long> {


    EmployeeEntity findBynic(String nic);
}
