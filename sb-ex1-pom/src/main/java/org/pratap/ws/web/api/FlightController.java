package org.pratap.ws.web.api;

import org.pratap.ws.model.Flight;
import org.pratap.ws.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FlightController {

    @Autowired
    private FlightRepository flightRepository;

    @GetMapping("/flights")
    public List<Flight> getAllFlights(){
        return flightRepository.findAll();
    }

    @PutMapping("/flights/add")
    public Flight addFlight(@RequestBody Flight flight){
        return flightRepository.save(flight);
    }

}
