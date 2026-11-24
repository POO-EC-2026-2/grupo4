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
@RequestMapping("/api/lotes")
public class LoteController {

    private final LoteService service;

    public LoteController(LoteService service) {
        this.service = service;
    }

    @PostMapping("/recebimento")
    public Lote registrarRecebimento(@RequestParam Long produtorId, @RequestParam Long produtoId, @RequestParam BigDecimal quantidade, @RequestParam LocalDate colheita, @RequestParam LocalDate validade, @RequestParam BigDecimal custo) {
        throw new UnsupportedOperationException("TODO");
    }

    @GetMapping("/{id}")
    public Lote buscar(@PathVariable Long id) {
        throw new UnsupportedOperationException("TODO");
    }

    @GetMapping("/codigo/{codigo}")
    public Lote buscarPorCodigo(@PathVariable String codigo) {
        throw new UnsupportedOperationException("TODO");
    }

    @GetMapping("/disponiveis")
    public List<Lote> listarDisponiveis(@RequestParam Long produtoId) {
        throw new UnsupportedOperationException("TODO");
    }

    @PostMapping("/{id}/bloquear")
    public void bloquear(@PathVariable Long id, @RequestParam String motivo) {
        throw new UnsupportedOperationException("TODO");
    }

}
