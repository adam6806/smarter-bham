package com.smarterbham.api.repository;

import com.smarterbham.api.model.AirQuality;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirQualityRepository extends JpaRepository<AirQuality, Long> {
}