package edu.icet.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDao extends JpaRepository<edu.icet.entity.CustomerEntity,Long> {
}
