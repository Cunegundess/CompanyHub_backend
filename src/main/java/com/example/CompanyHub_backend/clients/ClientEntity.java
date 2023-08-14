package com.example.CompanyHub_backend.clients;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Table(name = "Empresa_Cliente", schema = "public")
@Entity(name = "Empresa_Cliente")
@Data
public class ClientEntity {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;
    private String nome;
    private String contato;
    @Column(unique = true)
    private String cnpj;
    private Boolean status;
    @Temporal(TemporalType.DATE)
    private Date dataRegistro;
    private String logoUrl;
}
