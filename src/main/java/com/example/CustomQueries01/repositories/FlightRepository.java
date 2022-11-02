package com.example.CustomQueries01.repositories;

import com.example.CustomQueries01.entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Long> {
}