package com.deloitte.meupetshop.service;

import com.deloitte.meupetshop.model.Cliente;
import com.deloitte.meupetshop.repository.ClienteRepository;

import java.util.List;

public class ClienteService {

    private ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    public Cliente adicionar(Cliente cliente) {
        return repository.save(cliente);
    }

    public List<Cliente> listar() {
        return repository.findAll();
    }

    public Cliente alterar(Long id, Cliente cliente) {
        cliente.id = id;
        return repository.save(cliente);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
}