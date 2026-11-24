package br.com.gestaorural.model;

import java.math.BigDecimal;
import java.time.*;
import java.util.*;
import br.com.gestaorural.model.enums.*;

public class Produtor {

    private Long id;
    private String nome;
    private String documento;
    private String contato;
    private String propriedade;
    private String localizacao;
    private boolean ativo;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getDocumento() { return documento; }
    public void setDocumento(String documento) { this.documento = documento; }
    public String getContato() { return contato; }
    public void setContato(String contato) { this.contato = contato; }
    public String getPropriedade() { return propriedade; }
    public void setPropriedade(String propriedade) { this.propriedade = propriedade; }
    public String getLocalizacao() { return localizacao; }
    public void setLocalizacao(String localizacao) { this.localizacao = localizacao; }
    public boolean isAtivo() { return ativo; }
    public void setAtivo(boolean ativo) { this.ativo = ativo; }
}
