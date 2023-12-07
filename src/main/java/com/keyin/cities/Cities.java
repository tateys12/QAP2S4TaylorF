package com.keyin.cities;

import com.keyin.airport.Airport;
import com.keyin.passengers.Passengers;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cities {
    @Id
    @SequenceGenerator(name = "cities_sequence", sequenceName = "cities_sequence", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "cities_sequence")

    private Long id;
    private String name;
    private String state;
    private String population;

    @OneToMany
    private List<Airport> airport;

    @OneToMany
    private List<Passengers> passengers;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }
}
