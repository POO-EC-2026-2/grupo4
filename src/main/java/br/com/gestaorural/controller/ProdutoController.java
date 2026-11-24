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
@RequestMapping("/api/produtos")
public class ProdutoController {

    private final ProdutoService service;

    public ProdutoController(ProdutoService service) {
        this.service = service;
    }

    @PostMapping
    public Produto cadastrar(@RequestBody Produto produto) {
        throw new UnsupportedOperationException("TODO");
    }

    @PutMapping("/{id}")
    public Produto atualizar(@PathVariable Long id, @RequestBody Produto produto) {
        throw new UnsupportedOperationException("TODO");
    }

    @GetMapping("/{id}")
    public Produto buscar(@PathVariable Long id) {
        throw new UnsupportedOperationException("TODO");
    }

    @GetMapping
    public List<Produto> listar() {
        throw new UnsupportedOperationException("TODO");
    }

    @DeleteMapping("/{id}")
    public void remover(@PathVariable Long id) {
        throw new UnsupportedOperationException("TODO");
    }

    @GetMapping("/tipo/{tipo}")
    public List<Produto> listarPorTipo(@PathVariable TipoProduto tipo) {
        throw new UnsupportedOperationException("TODO");
    }

}
