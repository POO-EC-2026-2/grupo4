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
@RequestMapping("/api/produtores")
public class ProdutorController {

    private final ProdutorService service;

    public ProdutorController(ProdutorService service) {
        this.service = service;
    }

    @PostMapping
    public Produtor cadastrar(@RequestBody Produtor produtor) {
        throw new UnsupportedOperationException("TODO");
    }

    @PutMapping("/{id}")
    public Produtor atualizar(@PathVariable Long id, @RequestBody Produtor produtor) {
        throw new UnsupportedOperationException("TODO");
    }

    @GetMapping("/{id}")
    public Produtor buscar(@PathVariable Long id) {
        throw new UnsupportedOperationException("TODO");
    }

    @GetMapping
    public List<Produtor> listar() {
        throw new UnsupportedOperationException("TODO");
    }

    @DeleteMapping("/{id}")
    public void remover(@PathVariable Long id) {
        throw new UnsupportedOperationException("TODO");
    }

}
