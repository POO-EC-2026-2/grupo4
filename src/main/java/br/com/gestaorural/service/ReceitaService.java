package br.com.gestaorural.service;

import java.math.BigDecimal;
import java.time.*;
import java.util.*;
import br.com.gestaorural.dto.*;
import br.com.gestaorural.model.*;
import br.com.gestaorural.model.enums.*;
import br.com.gestaorural.repository.*;
import br.com.gestaorural.exception.*;

@org.springframework.stereotype.Service
public class ReceitaService {

    // TODO: injetar repositórios/serviços necessários via construtor

    public Receita cadastrar(Receita receita) {
        throw new UnsupportedOperationException("TODO");
    }

    public Receita atualizar(Long id, Receita receita) {
        throw new UnsupportedOperationException("TODO");
    }

    public Receita buscar(Long id) {
        throw new UnsupportedOperationException("TODO");
    }

    public List<Receita> listar() {
        throw new UnsupportedOperationException("TODO");
    }

    public void remover(Long id) {
        throw new UnsupportedOperationException("TODO");
    }

    public Map<Produto, BigDecimal> calcularNecessidade(Long receitaId, BigDecimal quantidade) {
        throw new UnsupportedOperationException("TODO");
    }

}
