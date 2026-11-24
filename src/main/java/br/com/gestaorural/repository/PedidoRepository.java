package br.com.gestaorural.repository;

import java.math.BigDecimal;
import java.time.*;
import java.util.*;
import br.com.gestaorural.model.*;
import br.com.gestaorural.model.enums.*;

public interface PedidoRepository extends Repositorio<Pedido, Long> {
    List<Pedido> buscarPorCliente(Long clienteId);
    List<Pedido> buscarPorLote(Long loteId);
}
