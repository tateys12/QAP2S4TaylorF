package com.keyin.airline;

import com.keyin.aircraft.Aircraft;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "airline", path = "airline")
public interface AirlineRestApi extends JpaRepository<Airline, Long> {
}