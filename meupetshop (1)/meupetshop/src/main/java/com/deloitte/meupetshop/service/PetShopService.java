package com.deloitte.meupetshop.service;

import org.springframework.stereotype.Service;
import java.util.*;
import com.deloitte.meupetshop.model.*;

@Service
public class PetShopService {

    public List<Cliente> clientes = new ArrayList<>();
    public List<Cao> caes = new ArrayList<>();
    public List<Agendamento> agenda = new ArrayList<>();


    public Cliente cadastrarCliente(Cliente cliente){
        clientes.add(cliente);
        return cliente;
    }

    public List<Cliente> listarClientes(){
        return clientes;
    }

    public void excluirCliente(String cpf){
        clientes.removeIf(c -> c.cpf.equals(cpf));
    }


    public Cao cadastrarCao(Cao cao){
        caes.add(cao);
        return cao;
    }

    public List<Cao> listarCaes(){
        return caes;
    }

    public void excluirCao(String chip){
        caes.removeIf(c -> c.chip.equals(chip));
    }


    public double calcularServico(String servico){

        if(servico.equalsIgnoreCase("banho")) return 30;

        if(servico.equalsIgnoreCase("tosa")) return 50;

        if(servico.equalsIgnoreCase("banho+tosa")) return 80;

        return 0;
    }


    public Agendamento agendar(Agendamento ag){
        agenda.add(ag);
        return ag;
    }

    public List<Agendamento> verAgenda(){
        return agenda;
    }

    public void cancelarAgendamento(String chip){
        agenda.removeIf(a -> a.chipCao.equals(chip));
    }

}