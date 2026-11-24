package br.com.gestaorural.service;

import java.math.BigDecimal;
import java.time.*;
import java.util.*;
import br.com.gestaorural.dto.*;
import br.com.gestaorural.model.*;
import br.com.gestaorural.model.enums.*;
import br.com.gestaorural.repository.*;
import br.com.gestaorural.exception.*;

@org.springframework.stereotype.Service
public class PrecoService {

    // TODO: injetar repositórios/serviços necessários via construtor

    public Preco definirPreco(Long produtoId, BigDecimal valor, LocalDate vigenteDe) {
        throw new UnsupportedOperationException("TODO");
    }

    public Preco obterPrecoVigente(Long produtoId, LocalDate data) {
        throw new UnsupportedOperationException("TODO");
    }

    public BigDecimal sugerirPreco(Long produtoId, BigDecimal margemPercentual) {
        throw new UnsupportedOperationException("TODO");
    }

    public List<Preco> historico(Long produtoId) {
        throw new UnsupportedOperationException("TODO");
    }

}
