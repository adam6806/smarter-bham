package com.smarterbham.api.repository;

import com.smarterbham.api.model.AirQuality;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AirQualityRepository extends JpaRepository<AirQuality, Long> {

    List<AirQuality> findAllByOrderByReceivedAtDesc();
}