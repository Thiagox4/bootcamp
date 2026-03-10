package com.deloitte.meupetshop.model;

public class Cliente {

    public String cpf;
    public String nome;
    public String dataNascimento;

    public Cliente(){}

    public Cliente(String cpf, String nome, String dataNascimento) {
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

}