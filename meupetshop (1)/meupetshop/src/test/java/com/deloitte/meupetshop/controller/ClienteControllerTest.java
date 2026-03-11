package com.deloitte.meupetshop.controller;

import com.deloitte.meupetshop.model.Cliente;
import com.deloitte.meupetshop.service.ClienteService;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteControllerTest {

    @Test
    public void deveListarClientes() {

        ClienteService service = Mockito.mock(ClienteService.class);

        Cliente cliente = new Cliente();
        cliente.nome = "Thiago";

        Mockito.when(service.listar()).thenReturn(List.of(cliente));

        ClienteController controller = new ClienteController(service);

        List<Cliente> lista = controller.listar();

        assertEquals(1, lista.size());
    }

    @Test
    public void deveAdicionarCliente() {

        ClienteService service = Mockito.mock(ClienteService.class);

        Cliente cliente = new Cliente();
        cliente.nome = "Thiago";

        Mockito.when(service.adicionar(cliente)).thenReturn(cliente);

        ClienteController controller = new ClienteController(service);

        Cliente resultado = controller.adicionar(cliente);

        assertEquals("Thiago", resultado.nome);
    }

    @Test
    public void deveAlterarCliente() {

        ClienteService service = Mockito.mock(ClienteService.class);

        Cliente cliente = new Cliente();
        cliente.nome = "Thiago Silva";

        Mockito.when(service.alterar(1L, cliente)).thenReturn(cliente);

        ClienteController controller = new ClienteController(service);

        Cliente resultado = controller.alterar(1L, cliente);

        assertEquals("Thiago Silva", resultado.nome);
    }

    @Test
    public void deveExcluirCliente() {

        ClienteService service = Mockito.mock(ClienteService.class);

        ClienteController controller = new ClienteController(service);

        controller.excluir(1L);

        Mockito.verify(service).excluir(1L);
    }
}
