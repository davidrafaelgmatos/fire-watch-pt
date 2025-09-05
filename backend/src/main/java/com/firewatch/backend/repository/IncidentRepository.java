package com.firewatch.backend.repository;

import com.firewatch.backend.model.Incident;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface IncidentRepository extends JpaRepository<Incident, String> {
    Optional<Incident> findByProCivId(String proCivId);
}
