package com.keyin.aircraft;

import com.keyin.airline.Airline;
import com.keyin.airport.Airport;
import com.keyin.passengers.Passengers;

import javax.persistence.*;
import java.util.List;

@Entity
public class Aircraft {
    @Id
    @SequenceGenerator(name = "aircraft_sequence", sequenceName = "aircraft_sequence", allocationSize = 1, initialValue=1)
    @GeneratedValue(generator = "aircraft_sequence")
    private long id;
    private String tailNumber;

    private boolean status;

    @ManyToMany
    private List<Airport> airport;

    @ManyToMany
    private List<Passengers> passengers;

    @ManyToMany
    private List<Airline> airline;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTailNumber() {
        return tailNumber;
    }

    public void setTailNumber(String tailNumber) {
        this.tailNumber = tailNumber;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
