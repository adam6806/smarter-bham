package com.smarterbham.api.repository;

import com.smarterbham.api.model.Connection;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConnectionRepository extends JpaRepository<Connection, Long> {

    List<Connection> findTop50ByOrderByReceivedAtDesc();
}