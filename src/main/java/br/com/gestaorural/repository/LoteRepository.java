package br.com.gestaorural.repository;

import java.math.BigDecimal;
import java.time.*;
import java.util.*;
import br.com.gestaorural.model.*;
import br.com.gestaorural.model.enums.*;

public interface LoteRepository extends Repositorio<Lote, Long> {
    Optional<Lote> buscarPorCodigo(String codigo);
    List<Lote> buscarDisponiveisPorProdutoOrdenadosPorValidade(Long produtoId);
    List<Lote> buscarVencendoAte(LocalDate data);
    List<Lote> buscarPorOrdemProducao(Long ordemId);
}
