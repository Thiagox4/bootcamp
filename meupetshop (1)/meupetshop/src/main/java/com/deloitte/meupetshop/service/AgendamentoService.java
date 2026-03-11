package com.deloitte.meupetshop.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.deloitte.meupetshop.model.Agendamento;
import com.deloitte.meupetshop.repository.AgendamentoRepository;

@Service
public class AgendamentoService {

    public AgendamentoRepository repository;

    public AgendamentoService(AgendamentoRepository repository){
        this.repository = repository;
    }

    public Agendamento adicionar(Agendamento agendamento){
        return repository.save(agendamento);
    }

    public List<Agendamento> listar(){
        return repository.findAll();
    }

    public Agendamento alterar(Long id, Agendamento agendamento){

        Agendamento a = repository.findById(id).orElse(null);

        if(a != null){
            a.servico = agendamento.servico;
            a.data = agendamento.data;
            a.nomeCao = agendamento.nomeCao;
            a.nomeCliente = agendamento.nomeCliente;

            return repository.save(a);
        }

        return null;
    }

    public void remover(Long id){
        repository.deleteById(id);
    }

    public void excluir(long l) {

    }
}