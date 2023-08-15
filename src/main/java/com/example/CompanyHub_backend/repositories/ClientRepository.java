package com.example.CompanyHub_backend.repositories;

import com.example.CompanyHub_backend.models.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClientRepository extends JpaRepository<ClientEntity, Long> {
    Optional<ClientEntity> findClientById(Long id);
    Optional<ClientEntity> findClientByCnpj(String cnpj);
}
