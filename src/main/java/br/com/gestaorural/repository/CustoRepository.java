package br.com.gestaorural.repository;

import java.math.BigDecimal;
import java.time.*;
import java.util.*;
import br.com.gestaorural.model.*;
import br.com.gestaorural.model.enums.*;

public interface CustoRepository extends Repositorio<Custo, Long> {
    List<Custo> buscarPorLote(Long loteId);
    List<Custo> buscarPorOrdem(Long ordemId);
}
