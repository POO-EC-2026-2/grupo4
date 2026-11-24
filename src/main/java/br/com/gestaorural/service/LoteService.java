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
public class LoteService {

    // TODO: injetar repositórios/serviços necessários via construtor

    public Lote registrarRecebimento(Long produtorId, Long produtoId, BigDecimal quantidade, LocalDate colheita, LocalDate validade, BigDecimal custo) {
        throw new UnsupportedOperationException("TODO");
    }

    public Lote gerarLoteDeProducao(OrdemProducao ordem) {
        throw new UnsupportedOperationException("TODO");
    }

    public Lote buscarPorCodigo(String codigo) {
        throw new UnsupportedOperationException("TODO");
    }

    public List<Lote> listarDisponiveis(Long produtoId) {
        throw new UnsupportedOperationException("TODO");
    }

    public String gerarCodigo(Produto produto) {
        throw new UnsupportedOperationException("TODO");
    }

    public void bloquear(Long loteId, String motivo) {
        throw new UnsupportedOperationException("TODO");
    }

    public Lote buscar(Long id) {
        throw new UnsupportedOperationException("TODO");
    }

    public List<Lote> listar() {
        throw new UnsupportedOperationException("TODO");
    }

}
