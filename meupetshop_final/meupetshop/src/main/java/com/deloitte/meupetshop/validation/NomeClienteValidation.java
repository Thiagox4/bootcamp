package com.deloitte.meupetshop.validation;

import org.springframework.stereotype.Component;
import com.deloitte.meupetshop.model.Agendamento;

@Component
public class NomeClienteValidation implements AgendamentoValidation {

    @Override
    public void validar(Agendamento agendamento) {

        if (agendamento.nomeCliente == null || agendamento.nomeCliente.isEmpty()) {
            throw new RuntimeException("Nome do cliente inválido");
        }

    }

}