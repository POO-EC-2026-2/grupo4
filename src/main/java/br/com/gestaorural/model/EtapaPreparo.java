package br.com.gestaorural.model;

import java.math.BigDecimal;
import java.time.*;
import java.util.*;
import br.com.gestaorural.model.enums.*;

public class EtapaPreparo {

    private Long id;
    private int ordem;
    private String descricao;
    private String responsavel;
    private LocalDateTime inicio;
    private LocalDateTime fim;
    private boolean concluida;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public int getOrdem() { return ordem; }
    public void setOrdem(int ordem) { this.ordem = ordem; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public String getResponsavel() { return responsavel; }
    public void setResponsavel(String responsavel) { this.responsavel = responsavel; }
    public LocalDateTime getInicio() { return inicio; }
    public void setInicio(LocalDateTime inicio) { this.inicio = inicio; }
    public LocalDateTime getFim() { return fim; }
    public void setFim(LocalDateTime fim) { this.fim = fim; }
    public boolean isConcluida() { return concluida; }
    public void setConcluida(boolean concluida) { this.concluida = concluida; }

    // ----- regras de domínio -----
    public void concluir() {
        throw new UnsupportedOperationException("TODO");
    }

}
