package com.deloitte.meupetshop.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @NotBlank
    public String nome;

    @Pattern(regexp = "\\d{11}", message = "CPF deve ter 11 números")
    public String cpf;

    @Pattern(regexp = "\\d{10,11}", message = "Telefone inválido")
    public String telefone;

}