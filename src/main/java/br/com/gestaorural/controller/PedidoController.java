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
@RequestMapping("/api/pedidos")
public class PedidoController {

    private final PedidoService service;

    public PedidoController(PedidoService service) {
        this.service = service;
    }

    @PostMapping
    public Pedido criar(@RequestBody PedidoRequest requisicao) {
        throw new UnsupportedOperationException("TODO");
    }

    @PostMapping("/{id}/itens")
    public Pedido adicionarItem(@PathVariable Long id, @RequestBody ItemPedidoRequest item) {
        throw new UnsupportedOperationException("TODO");
    }

    @PostMapping("/{id}/confirmar")
    public Pedido confirmar(@PathVariable Long id) {
        throw new UnsupportedOperationException("TODO");
    }

    @PostMapping("/{id}/cancelar")
    public void cancelar(@PathVariable Long id) {
        throw new UnsupportedOperationException("TODO");
    }

    @GetMapping("/{id}")
    public Pedido buscar(@PathVariable Long id) {
        throw new UnsupportedOperationException("TODO");
    }

    @GetMapping("/cliente/{clienteId}")
    public List<Pedido> listarPorCliente(@PathVariable Long clienteId) {
        throw new UnsupportedOperationException("TODO");
    }

}
