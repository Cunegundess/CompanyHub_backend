package com.example.CompanyHub_backend.models;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "Empresa_Filial", schema = "public")
@Entity(name = "Empresa_Filial")
@Data
public class LocationEntity {
    private Long id;
    private String local;
    @Column(unique = true)
    private String cnpj;
    private Boolean status;

    @ManyToOne
    @JoinColumn(name = "id_EmpresaCliente")
    private ClientEntity empresaCliente;
}
