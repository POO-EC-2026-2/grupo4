package br.com.gestaorural.model;

import java.math.BigDecimal;
import java.time.*;
import java.util.*;
import br.com.gestaorural.model.enums.*;

public class ItemPedido {

    private Long id;
    private Produto produto;
    private BigDecimal quantidade;
    private BigDecimal precoUnitario;
    private List<Lote> lotesAlocados;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Produto getProduto() { return produto; }
    public void setProduto(Produto produto) { this.produto = produto; }
    public BigDecimal getQuantidade() { return quantidade; }
    public void setQuantidade(BigDecimal quantidade) { this.quantidade = quantidade; }
    public BigDecimal getPrecoUnitario() { return precoUnitario; }
    public void setPrecoUnitario(BigDecimal precoUnitario) { this.precoUnitario = precoUnitario; }
    public List<Lote> getLotesAlocados() { return lotesAlocados; }
    public void setLotesAlocados(List<Lote> lotesAlocados) { this.lotesAlocados = lotesAlocados; }

    // ----- regras de domínio -----
    public BigDecimal calcularSubtotal() {
        throw new UnsupportedOperationException("TODO");
    }

}
