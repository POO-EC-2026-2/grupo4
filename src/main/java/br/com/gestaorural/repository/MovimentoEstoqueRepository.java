package br.com.gestaorural.repository;

import java.math.BigDecimal;
import java.time.*;
import java.util.*;
import br.com.gestaorural.model.*;
import br.com.gestaorural.model.enums.*;

public interface MovimentoEstoqueRepository extends Repositorio<MovimentoEstoque, Long> {
    List<MovimentoEstoque> buscarPorLote(Long loteId);
}
