package com.keyin.passengers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "passengers", path = "passengers")
public interface PassengersRestApi extends JpaRepository<Passengers, Long> {
}
