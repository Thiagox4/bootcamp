package com.deloitte.meupetshop.controller;

import com.deloitte.meupetshop.model.Cao;
import com.deloitte.meupetshop.service.CaoService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class CaoControllerTest {

    @Test
    public void deveListarCaes() {
        // Criando o Mock do Service
        CaoService service = Mockito.mock(CaoService.class);

        // Criando o objeto com atributo público
        Cao c = new Cao();
        c.nome = "Rex";

        // Configurando o Mockito
        Mockito.when(service.listar()).thenReturn(List.of(c));

        // Executando o Controller
        CaoController controller = new CaoController(service);
        List<Cao> lista = controller.listar();

        // Verificações
        assertEquals(1, lista.size());
        assertEquals("Rex", lista.get(0).nome);
    }
}