package br.com.gestaorural.repository;

import java.math.BigDecimal;
import java.time.*;
import java.util.*;
import br.com.gestaorural.model.*;
import br.com.gestaorural.model.enums.*;

public interface PrecoRepository extends Repositorio<Preco, Long> {
    Optional<Preco> buscarVigente(Long produtoId, LocalDate data);
    List<Preco> buscarHistorico(Long produtoId);
}
