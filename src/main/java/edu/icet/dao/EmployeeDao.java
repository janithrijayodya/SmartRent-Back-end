package edu.icet.dao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends JpaRepository<edu.icet.entity.EmployeeEntity,Long> {
}
