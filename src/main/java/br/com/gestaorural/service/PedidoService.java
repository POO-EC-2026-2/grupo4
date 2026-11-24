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
public class PedidoService {

    // TODO: injetar repositórios/serviços necessários via construtor

    public Pedido criar(PedidoRequest requisicao) {
        throw new UnsupportedOperationException("TODO");
    }

    public Pedido adicionarItem(Long pedidoId, ItemPedidoRequest item) {
        throw new UnsupportedOperationException("TODO");
    }

    public Pedido confirmar(Long pedidoId) {
        throw new UnsupportedOperationException("TODO");
    }

    public void cancelar(Long pedidoId) {
        throw new UnsupportedOperationException("TODO");
    }

    public void alocarLotes(Pedido pedido) {
        throw new UnsupportedOperationException("TODO");
    }

    public List<Pedido> listarPorCliente(Long clienteId) {
        throw new UnsupportedOperationException("TODO");
    }

    public Pedido buscar(Long id) {
        throw new UnsupportedOperationException("TODO");
    }

}
