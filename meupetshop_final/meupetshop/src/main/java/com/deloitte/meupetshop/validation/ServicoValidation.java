package com.deloitte.meupetshop.validation;

import org.springframework.stereotype.Component;
import com.deloitte.meupetshop.model.Agendamento;

@Component
public class ServicoValidation implements AgendamentoValidation {

    @Override
    public void validar(Agendamento agendamento) {

        if (agendamento.servico == null || agendamento.servico.isEmpty()) {
            throw new RuntimeException("Serviço obrigatório");
        }

    }

}