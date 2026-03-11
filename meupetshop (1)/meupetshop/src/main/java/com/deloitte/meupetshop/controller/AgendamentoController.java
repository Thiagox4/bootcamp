package com.deloitte.meupetshop.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.deloitte.meupetshop.model.Agendamento;
import com.deloitte.meupetshop.service.AgendamentoService;

@RestController
@RequestMapping("/agendamentos")
public class AgendamentoController {

    public AgendamentoService service;

    public AgendamentoController(AgendamentoService service){
        this.service = service;
    }

    @PostMapping
    public Agendamento adicionar(@RequestBody Agendamento agendamento){
        return service.adicionar(agendamento);
    }

    @GetMapping
    public List<Agendamento> listar(){
        return service.listar();
    }

    @PutMapping("/{id}")
    public Agendamento alterar(@PathVariable Long id, @RequestBody Agendamento agendamento){
        return service.alterar(id, agendamento);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id){
        service.excluir(id);
    }
}
