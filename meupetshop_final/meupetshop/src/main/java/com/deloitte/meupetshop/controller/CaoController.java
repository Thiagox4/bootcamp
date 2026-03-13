package com.deloitte.meupetshop.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.deloitte.meupetshop.model.Cao;
import com.deloitte.meupetshop.service.CaoService;

@RestController
@RequestMapping("/caes")
public class CaoController {

    public CaoService service;

    public CaoController(CaoService service){
        this.service = service;
    }

    @PostMapping
    public Cao adicionar(@RequestBody Cao cao){
        return service.adicionar(cao);
    }

    @GetMapping
    public List<Cao> listar(){
        return service.listar();
    }

    @PutMapping("/{id}")
    public Cao alterar(@PathVariable Long id, @RequestBody Cao cao){
        return service.alterar(id, cao);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id){
        service.excluir(id);
    }
}
