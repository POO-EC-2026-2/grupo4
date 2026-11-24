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
public class CustoService {

    // TODO: injetar repositórios/serviços necessários via construtor

    public Custo registrar(Custo custo) {
        throw new UnsupportedOperationException("TODO");
    }

    public BigDecimal calcularCustoLote(Long loteId) {
        throw new UnsupportedOperationException("TODO");
    }

    public BigDecimal calcularCustoOrdem(Long ordemId) {
        throw new UnsupportedOperationException("TODO");
    }

    public BigDecimal calcularCustoUnitario(Long loteId) {
        throw new UnsupportedOperationException("TODO");
    }

    public BigDecimal calcularMargemPedido(Long pedidoId) {
        throw new UnsupportedOperationException("TODO");
    }

    public List<Custo> listarPorLote(Long loteId) {
        throw new UnsupportedOperationException("TODO");
    }

}
