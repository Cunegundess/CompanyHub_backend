package com.example.CompanyHub_backend.repositories;

import com.example.CompanyHub_backend.models.LocationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<LocationEntity, Long> {
}
