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
@RequestMapping("/api/custos")
public class CustoController {

    private final CustoService service;

    public CustoController(CustoService service) {
        this.service = service;
    }

    @PostMapping
    public Custo registrar(@RequestBody Custo custo) {
        throw new UnsupportedOperationException("TODO");
    }

    @GetMapping("/lote/{loteId}")
    public BigDecimal calcularCustoLote(@PathVariable Long loteId) {
        throw new UnsupportedOperationException("TODO");
    }

    @GetMapping("/ordem/{ordemId}")
    public BigDecimal calcularCustoOrdem(@PathVariable Long ordemId) {
        throw new UnsupportedOperationException("TODO");
    }

    @GetMapping("/pedido/{pedidoId}/margem")
    public BigDecimal calcularMargemPedido(@PathVariable Long pedidoId) {
        throw new UnsupportedOperationException("TODO");
    }

}
