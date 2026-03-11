package com.deloitte.meupetshop.controller;

import com.deloitte.meupetshop.model.Agendamento;
import com.deloitte.meupetshop.service.AgendamentoService;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AgendamentoControllerTest {

    @Test
    public void deveListarAgendamentos() {

        AgendamentoService service = Mockito.mock(AgendamentoService.class);

        Agendamento a = new Agendamento();
        a.servico = "Banho";

        Mockito.when(service.listar()).thenReturn(List.of(a));

        AgendamentoController controller = new AgendamentoController(service);

        List<Agendamento> lista = controller.listar();

        assertEquals(1, lista.size());
    }

    @Test
    public void deveAdicionarAgendamento() {

        AgendamentoService service = Mockito.mock(AgendamentoService.class);

        Agendamento agendamento = new Agendamento();
        agendamento.servico = "Banho";

        Mockito.when(service.adicionar(agendamento)).thenReturn(agendamento);

        AgendamentoController controller = new AgendamentoController(service);

        Agendamento resultado = controller.adicionar(agendamento);

        assertEquals("Banho", resultado.servico);
    }

    @Test
    public void deveAlterarAgendamento() {

        AgendamentoService service = Mockito.mock(AgendamentoService.class);

        Agendamento agendamento = new Agendamento();
        agendamento.servico = "Tosa";

        Mockito.when(service.alterar(1L, agendamento)).thenReturn(agendamento);

        AgendamentoController controller = new AgendamentoController(service);

        Agendamento resultado = controller.alterar(1L, agendamento);

        assertEquals("Tosa", resultado.servico);
    }

    @Test
    public void deveExcluirAgendamento() {

        AgendamentoService service = Mockito.mock(AgendamentoService.class);

        AgendamentoController controller = new AgendamentoController(service);

        controller.excluir(1L);

        Mockito.verify(service).excluir(1L);
    }
}
