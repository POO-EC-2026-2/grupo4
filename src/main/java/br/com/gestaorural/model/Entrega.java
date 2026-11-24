package br.com.gestaorural.model;

import java.math.BigDecimal;
import java.time.*;
import java.util.*;
import br.com.gestaorural.model.enums.*;

public class Entrega {

    private Long id;
    private Pedido pedido;
    private StatusEntrega status;
    private LocalDate dataPrevista;
    private LocalDateTime dataEntrega;
    private String endereco;
    private String entregador;
    private String observacao;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Pedido getPedido() { return pedido; }
    public void setPedido(Pedido pedido) { this.pedido = pedido; }
    public StatusEntrega getStatus() { return status; }
    public void setStatus(StatusEntrega status) { this.status = status; }
    public LocalDate getDataPrevista() { return dataPrevista; }
    public void setDataPrevista(LocalDate dataPrevista) { this.dataPrevista = dataPrevista; }
    public LocalDateTime getDataEntrega() { return dataEntrega; }
    public void setDataEntrega(LocalDateTime dataEntrega) { this.dataEntrega = dataEntrega; }
    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
    public String getEntregador() { return entregador; }
    public void setEntregador(String entregador) { this.entregador = entregador; }
    public String getObservacao() { return observacao; }
    public void setObservacao(String observacao) { this.observacao = observacao; }

    // ----- regras de domínio -----
    public void iniciarRota() {
        throw new UnsupportedOperationException("TODO");
    }

    public void confirmar() {
        throw new UnsupportedOperationException("TODO");
    }

    public void registrarOcorrencia(String observacao) {
        throw new UnsupportedOperationException("TODO");
    }

}
