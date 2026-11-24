package br.com.gestaorural.model;

import java.math.BigDecimal;
import java.time.*;
import java.util.*;
import br.com.gestaorural.model.enums.*;

public class Pedido {

    private Long id;
    private Cliente cliente;
    private List<ItemPedido> itens;
    private StatusPedido status;
    private LocalDateTime dataPedido;
    private BigDecimal total;
    private Entrega entrega;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }
    public List<ItemPedido> getItens() { return itens; }
    public void setItens(List<ItemPedido> itens) { this.itens = itens; }
    public StatusPedido getStatus() { return status; }
    public void setStatus(StatusPedido status) { this.status = status; }
    public LocalDateTime getDataPedido() { return dataPedido; }
    public void setDataPedido(LocalDateTime dataPedido) { this.dataPedido = dataPedido; }
    public BigDecimal getTotal() { return total; }
    public void setTotal(BigDecimal total) { this.total = total; }
    public Entrega getEntrega() { return entrega; }
    public void setEntrega(Entrega entrega) { this.entrega = entrega; }

    // ----- regras de domínio -----
    public BigDecimal calcularTotal() {
        throw new UnsupportedOperationException("TODO");
    }

    public void confirmar() {
        throw new UnsupportedOperationException("TODO");
    }

    public void cancelar() {
        throw new UnsupportedOperationException("TODO");
    }

}
