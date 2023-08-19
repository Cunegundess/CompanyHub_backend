package com.example.CompanyHub_backend.models;

import jakarta.persistence.*;
import lombok.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Table(name = "Empresa_Cliente", schema = "public")
@Entity(name = "Empresa_Cliente")
@Data
public class ClientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Column(unique = true)
    private String contato;
    @Column(unique = true)
    private String cnpj;
    private Boolean status;
    @Temporal(TemporalType.DATE)
    private Date dataRegistro;
    private String logoUrl;
    @OneToMany(mappedBy = "empresaCliente")
    private List<DocEntity> empresaDocs = new ArrayList<>();

    @OneToMany(mappedBy = "empresaCliente")
    private List<LocationEntity> empresaLocations = new ArrayList<>();
}
