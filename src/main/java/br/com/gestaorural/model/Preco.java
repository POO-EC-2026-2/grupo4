package br.com.gestaorural.model;

import java.math.BigDecimal;
import java.time.*;
import java.util.*;
import br.com.gestaorural.model.enums.*;

public class Preco {

    private Long id;
    private Produto produto;
    private BigDecimal valor;
    private LocalDate vigenteDe;
    private LocalDate vigenteAte;
    private String tabela;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Produto getProduto() { return produto; }
    public void setProduto(Produto produto) { this.produto = produto; }
    public BigDecimal getValor() { return valor; }
    public void setValor(BigDecimal valor) { this.valor = valor; }
    public LocalDate getVigenteDe() { return vigenteDe; }
    public void setVigenteDe(LocalDate vigenteDe) { this.vigenteDe = vigenteDe; }
    public LocalDate getVigenteAte() { return vigenteAte; }
    public void setVigenteAte(LocalDate vigenteAte) { this.vigenteAte = vigenteAte; }
    public String getTabela() { return tabela; }
    public void setTabela(String tabela) { this.tabela = tabela; }

    // ----- regras de domínio -----
    public boolean estaVigente(LocalDate data) {
        throw new UnsupportedOperationException("TODO");
    }

}
