package com.deloitte.meupetshop.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String servico;
    public LocalDate data;
    public String nomeCao;
    public String nomeCliente;

}