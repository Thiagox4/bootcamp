package com.deloitte.meupetshop.service;

import com.deloitte.meupetshop.model.Agendamento;
import com.deloitte.meupetshop.repository.AgendamentoRepository;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class AgendamentoServiceTest {

    @Test
    public void deveAdicionarAgendamento() {

        AgendamentoRepository repository = Mockito.mock(AgendamentoRepository.class);

        Agendamento agendamento = new Agendamento();
        agendamento.servico = "Banho";

        Mockito.when(repository.save(agendamento)).thenReturn(agendamento);

        AgendamentoService service = new AgendamentoService(repository);

        Agendamento resultado = service.adicionar(agendamento);

        assertEquals("Banho", resultado.servico);
    }

    @Test
    public void deveListarAgendamentos() {

        AgendamentoRepository repository = Mockito.mock(AgendamentoRepository.class);

        Agendamento a1 = new Agendamento();
        a1.servico = "Banho";

        Agendamento a2 = new Agendamento();
        a2.servico = "Tosa";

        Mockito.when(repository.findAll()).thenReturn(List.of(a1, a2));

        AgendamentoService service = new AgendamentoService(repository);

        List<Agendamento> lista = service.listar();

        assertEquals(2, lista.size());
    }

    @Test
    public void deveAlterarAgendamento() {

        AgendamentoRepository repository = Mockito.mock(AgendamentoRepository.class);

        Agendamento agendamento = new Agendamento();
        agendamento.id = 1L;
        agendamento.servico = "Banho";

        Mockito.when(repository.findById(1L)).thenReturn(Optional.of(agendamento));

        agendamento.servico = "Tosa";

        Mockito.when(repository.save(agendamento)).thenReturn(agendamento);

        AgendamentoService service = new AgendamentoService(repository);

        Agendamento atualizado = service.alterar(1L, agendamento);

        assertEquals("Tosa", atualizado.servico);
    }

    @Test
    public void deveExcluirAgendamento() {

        AgendamentoRepository repository = Mockito.mock(AgendamentoRepository.class);

        AgendamentoService service = new AgendamentoService(repository);

        service.excluir(1L);

        Mockito.verify(repository).deleteById(1L);
    }
}
