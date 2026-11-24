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
public class EstoqueService {

    // TODO: injetar repositórios/serviços necessários via construtor

    public MovimentoEstoque registrarMovimento(MovimentoEstoqueRequest requisicao) {
        throw new UnsupportedOperationException("TODO");
    }

    public void registrarEntrada(Lote lote, BigDecimal quantidade, String referencia) {
        throw new UnsupportedOperationException("TODO");
    }

    public void registrarSaida(Long loteId, BigDecimal quantidade, String referencia) {
        throw new UnsupportedOperationException("TODO");
    }

    public void registrarAjuste(Long loteId, BigDecimal novaQuantidade, String motivo) {
        throw new UnsupportedOperationException("TODO");
    }

    public void registrarPerda(Long loteId, BigDecimal quantidade, String motivo) {
        throw new UnsupportedOperationException("TODO");
    }

    public BigDecimal consultarSaldoProduto(Long produtoId) {
        throw new UnsupportedOperationException("TODO");
    }

    public boolean verificarDisponibilidade(Long produtoId, BigDecimal quantidade) {
        throw new UnsupportedOperationException("TODO");
    }

    public List<Lote> reservarLotesPEPS(Long produtoId, BigDecimal quantidade) {
        throw new UnsupportedOperationException("TODO");
    }

    public List<MovimentoEstoque> extrato(Long loteId) {
        throw new UnsupportedOperationException("TODO");
    }

    public List<Lote> listarProximosDoVencimento(int dias) {
        throw new UnsupportedOperationException("TODO");
    }

}
