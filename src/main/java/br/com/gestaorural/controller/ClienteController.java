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
@RequestMapping("/api/clientes")
public class ClienteController {

    private final ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    @PostMapping
    public Cliente cadastrar(@RequestBody Cliente cliente) {
        throw new UnsupportedOperationException("TODO");
    }

    @PutMapping("/{id}")
    public Cliente atualizar(@PathVariable Long id, @RequestBody Cliente cliente) {
        throw new UnsupportedOperationException("TODO");
    }

    @GetMapping("/{id}")
    public Cliente buscar(@PathVariable Long id) {
        throw new UnsupportedOperationException("TODO");
    }

    @GetMapping
    public List<Cliente> listar() {
        throw new UnsupportedOperationException("TODO");
    }

    @DeleteMapping("/{id}")
    public void remover(@PathVariable Long id) {
        throw new UnsupportedOperationException("TODO");
    }

}
