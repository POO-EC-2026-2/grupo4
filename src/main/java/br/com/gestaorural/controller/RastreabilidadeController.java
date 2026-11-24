package br.com.gestaorural.controller;

import java.math.BigDecimal;
import java.time.*;
import java.util.*;
import org.springframework.web.bind.annotation.*;
import br.com.gestaorural.dto.*;
import br.com.gestaorural.model.*;
import br.com.gestaorural.model.enums.*;
import br.com.gestaorural.service.*;

@RestController
@RequestMapping("/api/rastreio")
public class RastreabilidadeController {

    private final RastreabilidadeService service;

    public RastreabilidadeController(RastreabilidadeService service) {
        this.service = service;
    }

    @GetMapping("/{codigoLote}")
    public RastreioResponse consultarPorCodigo(@PathVariable String codigoLote) {
        throw new UnsupportedOperationException("TODO");
    }

    @GetMapping("/lote/{loteId}/origem")
    public List<Lote> rastrearOrigem(@PathVariable Long loteId) {
        throw new UnsupportedOperationException("TODO");
    }

    @GetMapping("/lote/{loteId}/destino")
    public List<Cliente> rastrearDestino(@PathVariable Long loteId) {
        throw new UnsupportedOperationException("TODO");
    }

    @GetMapping("/lote/{loteId}/pedidos-afetados")
    public List<Pedido> pedidosAfetados(@PathVariable Long loteId) {
        throw new UnsupportedOperationException("TODO");
    }

    @GetMapping("/lote/{loteId}/linha-do-tempo")
    public List<EventoRastreio> linhaDoTempo(@PathVariable Long loteId) {
        throw new UnsupportedOperationException("TODO");
    }

}
