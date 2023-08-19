package com.example.CompanyHub_backend.services;

import com.example.CompanyHub_backend.models.ClientEntity;
import com.example.CompanyHub_backend.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    @Autowired
    private ClientRepository repository;

    public ClientEntity findClientById(Long id) throws Exception {
        return this.repository.findClientById(id).orElseThrow(() -> new Exception("Client não encontrado"));
    }

    public void saveClient(ClientEntity client){
        this.repository.save(client);
    }
}
