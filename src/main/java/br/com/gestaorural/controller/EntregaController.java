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
@RequestMapping("/api/entregas")
public class EntregaController {

    private final EntregaService service;

    public EntregaController(EntregaService service) {
        this.service = service;
    }

    @PostMapping
    public Entrega agendar(@RequestParam Long pedidoId, @RequestParam LocalDate dataPrevista, @RequestParam String entregador) {
        throw new UnsupportedOperationException("TODO");
    }

    @PostMapping("/{id}/iniciar")
    public Entrega iniciarRota(@PathVariable Long id) {
        throw new UnsupportedOperationException("TODO");
    }

    @PostMapping("/{id}/confirmar")
    public Entrega confirmarEntrega(@PathVariable Long id) {
        throw new UnsupportedOperationException("TODO");
    }

    @PostMapping("/{id}/ocorrencia")
    public Entrega registrarOcorrencia(@PathVariable Long id, @RequestParam String observacao) {
        throw new UnsupportedOperationException("TODO");
    }

    @GetMapping("/dia")
    public List<Entrega> listarDoDia(@RequestParam LocalDate data) {
        throw new UnsupportedOperationException("TODO");
    }

}
