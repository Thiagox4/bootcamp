package com.deloitte.meupetshop.service;

import org.springframework.stereotype.Service;
import java.util.List;

import com.deloitte.meupetshop.model.Cliente;
import com.deloitte.meupetshop.repository.ClienteRepository;

@Service
public class ClienteService implements ClienteServiceInterface {

    private final ClienteRepository repository;

    public ClienteService(ClienteRepository repository){
        this.repository = repository;
    }

    public Cliente adicionar(Cliente cliente){
        return repository.save(cliente);
    }

    public List<Cliente> listar(){
        return repository.findAll();
    }

    public Cliente alterar(Long id, Cliente cliente){

        Cliente c = repository.findById(id).orElse(null);

        if(c != null){
            c.nome = cliente.nome;
            c.cpf = cliente.cpf;
            c.telefone = cliente.telefone;

            return repository.save(c);
        }

        return null;
    }

    public void excluir(Long id){
        repository.deleteById(id);
    }

}