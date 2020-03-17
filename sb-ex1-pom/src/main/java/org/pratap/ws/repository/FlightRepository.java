package org.pratap.ws.repository;

import org.pratap.ws.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Long> {

}