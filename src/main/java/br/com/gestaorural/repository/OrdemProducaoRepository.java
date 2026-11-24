package br.com.gestaorural.repository;

import java.math.BigDecimal;
import java.time.*;
import java.util.*;
import br.com.gestaorural.model.*;
import br.com.gestaorural.model.enums.*;

public interface OrdemProducaoRepository extends Repositorio<OrdemProducao, Long> {
    List<OrdemProducao> buscarPorStatus(StatusOrdem status);
}
