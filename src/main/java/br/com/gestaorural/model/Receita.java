package br.com.gestaorural.model;

import java.math.BigDecimal;
import java.time.*;
import java.util.*;
import br.com.gestaorural.model.enums.*;

public class Receita {

    private Long id;
    private String nome;
    private Produto produtoFinal;
    private BigDecimal rendimento;
    private List<ItemReceita> itens;
    private List<String> etapas;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public Produto getProdutoFinal() { return produtoFinal; }
    public void setProdutoFinal(Produto produtoFinal) { this.produtoFinal = produtoFinal; }
    public BigDecimal getRendimento() { return rendimento; }
    public void setRendimento(BigDecimal rendimento) { this.rendimento = rendimento; }
    public List<ItemReceita> getItens() { return itens; }
    public void setItens(List<ItemReceita> itens) { this.itens = itens; }
    public List<String> getEtapas() { return etapas; }
    public void setEtapas(List<String> etapas) { this.etapas = etapas; }

    // ----- regras de domínio -----
    public Map<Produto, BigDecimal> calcularNecessidade(BigDecimal quantidadeDesejada) {
        throw new UnsupportedOperationException("TODO");
    }

}
