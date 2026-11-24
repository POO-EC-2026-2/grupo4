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
public class RastreabilidadeService {

    // TODO: injetar repositórios/serviços necessários via construtor

    public EventoRastreio registrarEvento(Long loteId, TipoEvento tipo, String descricao, String responsavel) {
        throw new UnsupportedOperationException("TODO");
    }

    public List<EventoRastreio> linhaDoTempo(Long loteId) {
        throw new UnsupportedOperationException("TODO");
    }

    public List<Lote> rastrearOrigem(Long loteId) {
        throw new UnsupportedOperationException("TODO");
    }

    public List<Cliente> rastrearDestino(Long loteId) {
        throw new UnsupportedOperationException("TODO");
    }

    public List<Pedido> pedidosAfetados(Long loteId) {
        throw new UnsupportedOperationException("TODO");
    }

    public RastreioResponse consultarPorCodigo(String codigoLote) {
        throw new UnsupportedOperationException("TODO");
    }

}
