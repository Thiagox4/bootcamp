package com.deloitte.meupetshop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.deloitte.meupetshop.model.Agendamento;
import com.deloitte.meupetshop.repository.AgendamentoRepository;
import com.deloitte.meupetshop.validation.AgendamentoValidation;
import com.deloitte.meupetshop.email.EmailService;

@Service
public class AgendamentoService {

    public AgendamentoRepository repository;
    public List<AgendamentoValidation> validations;
    public EmailService emailService;

    public AgendamentoService(
            AgendamentoRepository repository,
            List<AgendamentoValidation> validations,
            EmailService emailService) {

        this.repository = repository;
        this.validations = validations;
        this.emailService = emailService;
    }

    public Agendamento adicionar(Agendamento agendamento) {

        for (AgendamentoValidation validation : validations) {
            validation.validar(agendamento);
        }

        Agendamento novo = repository.save(agendamento);

        emailService.enviarConfirmacao(novo);

        return novo;
    }

    public List<Agendamento> listar() {
        return repository.findAll();
    }

    public Agendamento alterar(Long id, Agendamento agendamento) {

        Agendamento a = repository.findById(id).orElse(null);

        if (a != null) {

            a.servico = agendamento.servico;
            a.data = agendamento.data;
            a.nomeCao = agendamento.nomeCao;
            a.nomeCliente = agendamento.nomeCliente;

            return repository.save(a);
        }

        return null;
    }

    public void remover(Long id) {
        repository.deleteById(id);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
}