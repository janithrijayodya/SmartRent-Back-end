package edu.icet.dao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalDao extends JpaRepository<edu.icet.entity.RentalEntity,Long> {
}
