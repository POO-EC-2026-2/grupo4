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
public class EntregaService {

    // TODO: injetar repositórios/serviços necessários via construtor

    public Entrega agendar(Long pedidoId, LocalDate dataPrevista, String entregador) {
        throw new UnsupportedOperationException("TODO");
    }

    public Entrega iniciarRota(Long entregaId) {
        throw new UnsupportedOperationException("TODO");
    }

    public Entrega confirmarEntrega(Long entregaId) {
        throw new UnsupportedOperationException("TODO");
    }

    public Entrega registrarOcorrencia(Long entregaId, String observacao) {
        throw new UnsupportedOperationException("TODO");
    }

    public List<Entrega> listarPorStatus(StatusEntrega status) {
        throw new UnsupportedOperationException("TODO");
    }

    public List<Entrega> listarDoDia(LocalDate data) {
        throw new UnsupportedOperationException("TODO");
    }

}
