package br.com.gestaorural.model;

import java.math.BigDecimal;
import java.time.*;
import java.util.*;
import br.com.gestaorural.model.enums.*;

public class Lote {

    private Long id;
    private String codigo;
    private Produto produto;
    private Produtor produtor;
    private List<Lote> lotesOrigem;
    private OrdemProducao ordemProducao;
    private BigDecimal quantidadeInicial;
    private BigDecimal quantidadeAtual;
    private LocalDate dataColheitaOuProducao;
    private LocalDate validade;
    private BigDecimal custoTotal;
    private StatusLote status;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }
    public Produto getProduto() { return produto; }
    public void setProduto(Produto produto) { this.produto = produto; }
    public Produtor getProdutor() { return produtor; }
    public void setProdutor(Produtor produtor) { this.produtor = produtor; }
    public List<Lote> getLotesOrigem() { return lotesOrigem; }
    public void setLotesOrigem(List<Lote> lotesOrigem) { this.lotesOrigem = lotesOrigem; }
    public OrdemProducao getOrdemProducao() { return ordemProducao; }
    public void setOrdemProducao(OrdemProducao ordemProducao) { this.ordemProducao = ordemProducao; }
    public BigDecimal getQuantidadeInicial() { return quantidadeInicial; }
    public void setQuantidadeInicial(BigDecimal quantidadeInicial) { this.quantidadeInicial = quantidadeInicial; }
    public BigDecimal getQuantidadeAtual() { return quantidadeAtual; }
    public void setQuantidadeAtual(BigDecimal quantidadeAtual) { this.quantidadeAtual = quantidadeAtual; }
    public LocalDate getDataColheitaOuProducao() { return dataColheitaOuProducao; }
    public void setDataColheitaOuProducao(LocalDate dataColheitaOuProducao) { this.dataColheitaOuProducao = dataColheitaOuProducao; }
    public LocalDate getValidade() { return validade; }
    public void setValidade(LocalDate validade) { this.validade = validade; }
    public BigDecimal getCustoTotal() { return custoTotal; }
    public void setCustoTotal(BigDecimal custoTotal) { this.custoTotal = custoTotal; }
    public StatusLote getStatus() { return status; }
    public void setStatus(StatusLote status) { this.status = status; }

    // ----- regras de domínio -----
    public BigDecimal calcularCustoUnitario() {
        throw new UnsupportedOperationException("TODO");
    }

    public boolean estaVencido() {
        throw new UnsupportedOperationException("TODO");
    }

    public boolean temSaldo(BigDecimal quantidade) {
        throw new UnsupportedOperationException("TODO");
    }

    public boolean origemEhProdutor() {
        throw new UnsupportedOperationException("TODO");
    }

}
