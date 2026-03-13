package com.deloitte.meupetshop.email;

import org.springframework.stereotype.Service;
import com.deloitte.meupetshop.model.Agendamento;

@Service
public class EmailService {

    public void enviarConfirmacao(Agendamento agendamento) {

        System.out.println(
                "Email enviado para o cliente: " + agendamento.nomeCliente +
                        " confirmando o serviço: " + agendamento.servico
        );

    }

}