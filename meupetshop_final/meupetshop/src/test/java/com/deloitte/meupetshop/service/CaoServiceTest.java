package com.deloitte.meupetshop.service;

import com.deloitte.meupetshop.model.Cao;
import com.deloitte.meupetshop.repository.CaoRepository;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class CaoServiceTest {

    @Test
    public void deveAdicionarCao() {

        CaoRepository repository = Mockito.mock(CaoRepository.class);

        Cao cao = new Cao();
        cao.nome = "Rex";

        Mockito.when(repository.save(cao)).thenReturn(cao);

        CaoService service = new CaoService(repository);

        Cao resultado = service.adicionar(cao);

        assertEquals("Rex", resultado.nome);
    }

    @Test
    public void deveListarCaes() {

        CaoRepository repository = Mockito.mock(CaoRepository.class);

        Cao c1 = new Cao();
        c1.nome = "Rex";

        Cao c2 = new Cao();
        c2.nome = "Bolt";

        Mockito.when(repository.findAll()).thenReturn(List.of(c1, c2));

        CaoService service = new CaoService(repository);

        List<Cao> lista = service.listar();

        assertEquals(2, lista.size());
    }

    @Test
    public void deveAlterarCao() {

        CaoRepository repository = Mockito.mock(CaoRepository.class);

        Cao cao = new Cao();
        cao.id = 1L;
        cao.nome = "Rex";

        Mockito.when(repository.findById(1L)).thenReturn(Optional.of(cao));

        cao.nome = "Rex Silva";

        Mockito.when(repository.save(cao)).thenReturn(cao);

        CaoService service = new CaoService(repository);

        Cao atualizado = service.alterar(1L, cao);

        assertEquals("Rex Silva", atualizado.nome);
    }

    @Test
    public void deveExcluirCao() {

        CaoRepository repository = Mockito.mock(CaoRepository.class);

        CaoService service = new CaoService(repository);

        service.excluir(1L);

        Mockito.verify(repository).deleteById(1L);
    }
}
