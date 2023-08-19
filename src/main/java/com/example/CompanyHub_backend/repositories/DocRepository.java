package com.example.CompanyHub_backend.repositories;

import com.example.CompanyHub_backend.models.ClientEntity;
import com.example.CompanyHub_backend.models.DocEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DocRepository extends JpaRepository<DocEntity, Long> {
}
