package edu.icet.dao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DailyContactDao extends JpaRepository<edu.icet.entity.DailyContactEntity, Long> {
}
