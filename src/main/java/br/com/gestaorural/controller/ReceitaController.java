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
@RequestMapping("/api/receitas")
public class ReceitaController {

    private final ReceitaService service;

    public ReceitaController(ReceitaService service) {
        this.service = service;
    }

    @PostMapping
    public Receita cadastrar(@RequestBody Receita receita) {
        throw new UnsupportedOperationException("TODO");
    }

    @PutMapping("/{id}")
    public Receita atualizar(@PathVariable Long id, @RequestBody Receita receita) {
        throw new UnsupportedOperationException("TODO");
    }

    @GetMapping("/{id}")
    public Receita buscar(@PathVariable Long id) {
        throw new UnsupportedOperationException("TODO");
    }

    @GetMapping
    public List<Receita> listar() {
        throw new UnsupportedOperationException("TODO");
    }

    @DeleteMapping("/{id}")
    public void remover(@PathVariable Long id) {
        throw new UnsupportedOperationException("TODO");
    }

    @GetMapping("/{id}/necessidade")
    public Map<Produto, BigDecimal> calcularNecessidade(@PathVariable Long id, @RequestParam BigDecimal quantidade) {
        throw new UnsupportedOperationException("TODO");
    }

}
