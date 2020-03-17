package org.pratap.ws.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Flight {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private Long flightNo;
    private String departureLocation;
    private String arrivalLocation;

    public Flight(Long flightNo, String departureLocation, String arrivalLocation) {
        this.flightNo = flightNo;
        this.departureLocation = departureLocation;
        this.arrivalLocation = arrivalLocation;
    }
}
