package com.deloitte.meupetshop.service;

import java.util.List;
import com.deloitte.meupetshop.model.Cliente;

public interface ClienteServiceInterface {

    Cliente adicionar(Cliente cliente);

    List<Cliente> listar();

    Cliente alterar(Long id, Cliente cliente);

    void excluir(Long id);
}