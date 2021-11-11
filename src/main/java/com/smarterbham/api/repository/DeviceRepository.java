package com.smarterbham.api.repository;

import com.smarterbham.api.model.Device;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository extends JpaRepository<Device, String> {
}