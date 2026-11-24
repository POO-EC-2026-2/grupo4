package br.com.gestaorural.model;

import java.math.BigDecimal;
import java.time.*;
import java.util.*;
import br.com.gestaorural.model.enums.*;

public class ItemReceita {

    private Long id;
    private Produto insumo;
    private BigDecimal quantidade;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Produto getInsumo() { return insumo; }
    public void setInsumo(Produto insumo) { this.insumo = insumo; }
    public BigDecimal getQuantidade() { return quantidade; }
    public void setQuantidade(BigDecimal quantidade) { this.quantidade = quantidade; }
}
