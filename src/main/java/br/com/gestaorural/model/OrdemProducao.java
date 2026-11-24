package br.com.gestaorural.model;

import java.math.BigDecimal;
import java.time.*;
import java.util.*;
import br.com.gestaorural.model.enums.*;

public class OrdemProducao {

    private Long id;
    private String numero;
    private Receita receita;
    private BigDecimal quantidadePlanejada;
    private BigDecimal quantidadeProduzida;
    private StatusOrdem status;
    private LocalDateTime inicio;
    private LocalDateTime fim;
    private List<EtapaPreparo> etapas;
    private List<Lote> lotesConsumidos;
    private Lote loteGerado;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }
    public Receita getReceita() { return receita; }
    public void setReceita(Receita receita) { this.receita = receita; }
    public BigDecimal getQuantidadePlanejada() { return quantidadePlanejada; }
    public void setQuantidadePlanejada(BigDecimal quantidadePlanejada) { this.quantidadePlanejada = quantidadePlanejada; }
    public BigDecimal getQuantidadeProduzida() { return quantidadeProduzida; }
    public void setQuantidadeProduzida(BigDecimal quantidadeProduzida) { this.quantidadeProduzida = quantidadeProduzida; }
    public StatusOrdem getStatus() { return status; }
    public void setStatus(StatusOrdem status) { this.status = status; }
    public LocalDateTime getInicio() { return inicio; }
    public void setInicio(LocalDateTime inicio) { this.inicio = inicio; }
    public LocalDateTime getFim() { return fim; }
    public void setFim(LocalDateTime fim) { this.fim = fim; }
    public List<EtapaPreparo> getEtapas() { return etapas; }
    public void setEtapas(List<EtapaPreparo> etapas) { this.etapas = etapas; }
    public List<Lote> getLotesConsumidos() { return lotesConsumidos; }
    public void setLotesConsumidos(List<Lote> lotesConsumidos) { this.lotesConsumidos = lotesConsumidos; }
    public Lote getLoteGerado() { return loteGerado; }
    public void setLoteGerado(Lote loteGerado) { this.loteGerado = loteGerado; }

    // ----- regras de domínio -----
    public void iniciar() {
        throw new UnsupportedOperationException("TODO");
    }

    public void concluir(BigDecimal quantidadeProduzida) {
        throw new UnsupportedOperationException("TODO");
    }

    public void cancelar() {
        throw new UnsupportedOperationException("TODO");
    }

    public BigDecimal calcularRendimentoReal() {
        throw new UnsupportedOperationException("TODO");
    }

}
