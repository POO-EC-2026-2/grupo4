package br.com.gestaorural.model;

import java.math.BigDecimal;
import java.time.*;
import java.util.*;
import br.com.gestaorural.model.enums.*;

public class Custo {

    private Long id;
    private TipoCusto tipo;
    private BigDecimal valor;
    private String descricao;
    private Lote lote;
    private OrdemProducao ordemProducao;
    private LocalDate data;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public TipoCusto getTipo() { return tipo; }
    public void setTipo(TipoCusto tipo) { this.tipo = tipo; }
    public BigDecimal getValor() { return valor; }
    public void setValor(BigDecimal valor) { this.valor = valor; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public Lote getLote() { return lote; }
    public void setLote(Lote lote) { this.lote = lote; }
    public OrdemProducao getOrdemProducao() { return ordemProducao; }
    public void setOrdemProducao(OrdemProducao ordemProducao) { this.ordemProducao = ordemProducao; }
    public LocalDate getData() { return data; }
    public void setData(LocalDate data) { this.data = data; }
}
