package com.keyin.gates;

import com.keyin.aircraft.Aircraft;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "gates", path = "gates")
public interface GatesRestApi extends JpaRepository<Gates, Long> {
}
