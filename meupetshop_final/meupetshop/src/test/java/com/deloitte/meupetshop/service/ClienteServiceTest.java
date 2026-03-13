package com.deloitte.meupetshop.service;

import com.deloitte.meupetshop.model.Cliente;
import com.deloitte.meupetshop.repository.ClienteRepository;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteServiceTest {

    @Test
    public void deveAdicionarCliente() {

        ClienteRepository repository = Mockito.mock(ClienteRepository.class);

        Cliente cliente = new Cliente();
        cliente.nome = "Thiago";

        Mockito.when(repository.save(cliente)).thenReturn(cliente);

        ClienteService service = new ClienteService(repository);

        Cliente resultado = service.adicionar(cliente);

        assertEquals("Thiago", resultado.nome);
    }

    @Test
    public void deveListarClientes() {

        ClienteRepository repository = Mockito.mock(ClienteRepository.class);

        Cliente c1 = new Cliente();
        c1.nome = "Thiago";

        Cliente c2 = new Cliente();
        c2.nome = "Maria";

        Mockito.when(repository.findAll()).thenReturn(List.of(c1, c2));

        ClienteService service = new ClienteService(repository);

        List<Cliente> lista = service.listar();

        assertEquals(2, lista.size());
    }

    @Test
    public void deveAlterarCliente() {

        ClienteRepository repository = Mockito.mock(ClienteRepository.class);

        Cliente cliente = new Cliente();
        cliente.id = 1L;
        cliente.nome = "Thiago";

        Mockito.when(repository.findById(1L)).thenReturn(Optional.of(cliente));

        cliente.nome = "Thiago Silva";

        Mockito.when(repository.save(cliente)).thenReturn(cliente);

        ClienteService service = new ClienteService(repository);

        Cliente atualizado = service.alterar(1L, cliente);

        assertEquals("Thiago Silva", atualizado.nome);
    }

    @Test
    public void deveExcluirCliente() {

        ClienteRepository repository = Mockito.mock(ClienteRepository.class);

        ClienteService service = new ClienteService(repository);

        service.excluir(1L);

        Mockito.verify(repository).deleteById(1L);
    }
}
