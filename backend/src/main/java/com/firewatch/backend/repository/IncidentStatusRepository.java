package com.firewatch.backend.repository;

import com.firewatch.backend.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncidentStatusRepository extends JpaRepository<Status, String> {
}
