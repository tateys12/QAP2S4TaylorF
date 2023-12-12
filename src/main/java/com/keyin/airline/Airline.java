package com.keyin.airline;

import com.keyin.aircraft.*;

import javax.persistence.*;
import java.util.List;

@Entity
public class Airline {
    @Id
    @SequenceGenerator(name = "airline_sequence", sequenceName = "airline_sequence", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "airline_sequence")
    private Long id;
    private String name;

    @ManyToMany
    private List<Aircraft> aircraft;

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
}
