package com.example.CompanyHub_backend.models;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Table(name = "Empresa_Doc", schema = "public")
@Entity(name = "Empresa_Doc")
@Data
public class DocEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Boolean status;
    private Integer valorTransacao;
    private Date dataTransacao;
    private String nomeConta;
    @Column(unique = true)
    private Integer numeroConta;
    private Date dataVencimento;
    private String logoUrl;

    @ManyToOne
    @JoinColumn(name = "id_EmpresaCliente")
    private ClientEntity empresaCliente;
}
