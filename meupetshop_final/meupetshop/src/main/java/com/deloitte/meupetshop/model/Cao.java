package com.deloitte.meupetshop.model;

import jakarta.persistence.*;

@Entity
public class Cao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String nome;

    public String raca;

    public int idade;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    public Cliente cliente;

}