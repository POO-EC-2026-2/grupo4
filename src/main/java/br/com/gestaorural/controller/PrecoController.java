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
@RequestMapping("/api/precos")
public class PrecoController {

    private final PrecoService service;

    public PrecoController(PrecoService service) {
        this.service = service;
    }

    @PostMapping
    public Preco definirPreco(@RequestParam Long produtoId, @RequestParam BigDecimal valor, @RequestParam LocalDate vigenteDe) {
        throw new UnsupportedOperationException("TODO");
    }

    @GetMapping("/vigente/{produtoId}")
    public Preco obterPrecoVigente(@PathVariable Long produtoId, @RequestParam LocalDate data) {
        throw new UnsupportedOperationException("TODO");
    }

    @GetMapping("/sugestao/{produtoId}")
    public BigDecimal sugerirPreco(@PathVariable Long produtoId, @RequestParam BigDecimal margemPercentual) {
        throw new UnsupportedOperationException("TODO");
    }

    @GetMapping("/historico/{produtoId}")
    public List<Preco> historico(@PathVariable Long produtoId) {
        throw new UnsupportedOperationException("TODO");
    }

}
