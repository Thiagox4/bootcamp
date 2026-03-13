package com.deloitte.meupetshop.validation;

import org.springframework.stereotype.Component;
import com.deloitte.meupetshop.model.Agendamento;

@Component
public class NomeCaoValidation implements AgendamentoValidation {

    @Override
    public void validar(Agendamento agendamento) {

        if (agendamento.nomeCao == null || agendamento.nomeCao.isEmpty()) {
            throw new RuntimeException("Nome do cão inválido");
        }

    }

}