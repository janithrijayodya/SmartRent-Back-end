package edu.icet.dao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleDao extends JpaRepository<edu.icet.entity.VehicleEntity,Long> {
}