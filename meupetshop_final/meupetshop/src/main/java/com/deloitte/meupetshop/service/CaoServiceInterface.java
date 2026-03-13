package com.deloitte.meupetshop.service;

import java.util.List;
import com.deloitte.meupetshop.model.Cao;

public interface CaoServiceInterface {

    Cao adicionar(Cao cao);

    List<Cao> listar();

    Cao alterar(Long id, Cao cao);

    void excluir(Long id);
}
