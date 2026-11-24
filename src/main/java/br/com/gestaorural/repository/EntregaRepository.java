package br.com.gestaorural.repository;

import java.math.BigDecimal;
import java.time.*;
import java.util.*;
import br.com.gestaorural.model.*;
import br.com.gestaorural.model.enums.*;

public interface EntregaRepository extends Repositorio<Entrega, Long> {
    List<Entrega> buscarPorStatus(StatusEntrega status);
    List<Entrega> buscarPorData(LocalDate data);
}
