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
public class ProdutoService {

    // TODO: injetar repositórios/serviços necessários via construtor

    public Produto cadastrar(Produto produto) {
        throw new UnsupportedOperationException("TODO");
    }

    public Produto atualizar(Long id, Produto produto) {
        throw new UnsupportedOperationException("TODO");
    }

    public Produto buscar(Long id) {
        throw new UnsupportedOperationException("TODO");
    }

    public List<Produto> listar() {
        throw new UnsupportedOperationException("TODO");
    }

    public void remover(Long id) {
        throw new UnsupportedOperationException("TODO");
    }

    public List<Produto> listarPorTipo(TipoProduto tipo) {
        throw new UnsupportedOperationException("TODO");
    }

}
