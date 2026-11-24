package br.com.gestaorural.model;

import java.math.BigDecimal;
import java.time.*;
import java.util.*;
import br.com.gestaorural.model.enums.*;

public class Produto {

    private Long id;
    private String nome;
    private String sku;
    private TipoProduto tipo;
    private UnidadeMedida unidade;
    private boolean perecivel;
    private Integer validadeDias;
    private boolean ativo;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getSku() { return sku; }
    public void setSku(String sku) { this.sku = sku; }
    public TipoProduto getTipo() { return tipo; }
    public void setTipo(TipoProduto tipo) { this.tipo = tipo; }
    public UnidadeMedida getUnidade() { return unidade; }
    public void setUnidade(UnidadeMedida unidade) { this.unidade = unidade; }
    public boolean isPerecivel() { return perecivel; }
    public void setPerecivel(boolean perecivel) { this.perecivel = perecivel; }
    public Integer getValidadeDias() { return validadeDias; }
    public void setValidadeDias(Integer validadeDias) { this.validadeDias = validadeDias; }
    public boolean isAtivo() { return ativo; }
    public void setAtivo(boolean ativo) { this.ativo = ativo; }
}
