package com.deloitte.meupetshop.controller;

import com.deloitte.meupetshop.model.Cliente;
import com.deloitte.meupetshop.service.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    public ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    @GetMapping
    public List<Cliente> listar() {
        return service.listar();
    }

    @PostMapping
    public Cliente adicionar(@RequestBody Cliente cliente) {
        return service.adicionar(cliente);
    }

    @PutMapping("/{id}")
    public Cliente alterar(@PathVariable Long id, @RequestBody Cliente cliente) {
        return service.alterar(id, cliente);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        service.excluir(id);
    }
}
