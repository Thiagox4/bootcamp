package com.deloitte.meupetshop.model;

public class Agendamento {

    public String chipCao;
    public String servico;
    public String horario;

    public Agendamento(){}

    public Agendamento(String chipCao, String servico, String horario) {
        this.chipCao = chipCao;
        this.servico = servico;
        this.horario = horario;
    }

}