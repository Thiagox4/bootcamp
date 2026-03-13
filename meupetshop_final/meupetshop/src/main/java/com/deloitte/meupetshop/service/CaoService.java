package com.deloitte.meupetshop.service;

import org.springframework.stereotype.Service;
import java.util.List;

import com.deloitte.meupetshop.model.Cao;
import com.deloitte.meupetshop.repository.CaoRepository;

@Service
public class CaoService implements CaoServiceInterface {

    private final CaoRepository repository;

    public CaoService(CaoRepository repository){
        this.repository = repository;
    }

    @Override
    public Cao adicionar(Cao cao){
        return repository.save(cao);
    }

    @Override
    public List<Cao> listar(){
        return repository.findAll();
    }

    @Override
    public Cao alterar(Long id, Cao cao){

        Cao c = repository.findById(id).orElse(null);

        if(c != null){
            c.nome = cao.nome;
            c.raca = cao.raca;
            c.idade = cao.idade;

            return repository.save(c);
        }

        return null;
    }

    @Override
    public void excluir(Long id){
        repository.deleteById(id);
    }
}
