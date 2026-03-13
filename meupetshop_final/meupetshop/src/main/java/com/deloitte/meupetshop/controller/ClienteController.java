package com.deloitte.meupetshop.controller;

import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.List;

import com.deloitte.meupetshop.model.Cliente;
import com.deloitte.meupetshop.service.ClienteServiceInterface;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteServiceInterface service;

    public ClienteController(ClienteServiceInterface service){
        this.service = service;
    }

    @PostMapping
    public Cliente adicionar(@RequestBody @Valid Cliente cliente){
        return service.adicionar(cliente);
    }

    @GetMapping
    public List<Cliente> listar(){
        return service.listar();
    }

    @PutMapping("/{id}")
    public Cliente alterar(@PathVariable Long id, @RequestBody Cliente cliente){
        return service.alterar(id, cliente);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id){
        service.excluir(id);
    }

}