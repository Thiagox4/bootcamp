package com.deloitte.meupetshop.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.deloitte.meupetshop.service.PetShopService;
import com.deloitte.meupetshop.model.*;

@RestController
@RequestMapping("/petshop")
public class PetShopController {

    public PetShopService service = new PetShopService();


    @PostMapping("/cliente")
    public Cliente cadastrarCliente(@RequestBody Cliente cliente){
        return service.cadastrarCliente(cliente);
    }


    @GetMapping("/clientes")
    public List<Cliente> listarClientes(){
        return service.listarClientes();
    }


    @DeleteMapping("/cliente/{cpf}")
    public void excluirCliente(@PathVariable String cpf){
        service.excluirCliente(cpf);
    }


    @PostMapping("/cao")
    public Cao cadastrarCao(@RequestBody Cao cao){
        return service.cadastrarCao(cao);
    }


    @GetMapping("/caes")
    public List<Cao> listarCaes(){
        return service.listarCaes();
    }


    @DeleteMapping("/cao/{chip}")
    public void excluirCao(@PathVariable String chip){
        service.excluirCao(chip);
    }


    @GetMapping("/calcular")
    public double calcularServico(@RequestParam String servico){
        return service.calcularServico(servico);
    }


    @PostMapping("/agendar")
    public Agendamento agendar(@RequestBody Agendamento ag){
        return service.agendar(ag);
    }


    @GetMapping("/agenda")
    public List<Agendamento> verAgenda(){
        return service.verAgenda();
    }


    @DeleteMapping("/agenda/{chip}")
    public void cancelar(@PathVariable String chip){
        service.cancelarAgendamento(chip);
    }

}