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
@RequestMapping("/api/estoque")
public class EstoqueController {

    private final EstoqueService service;

    public EstoqueController(EstoqueService service) {
        this.service = service;
    }

    @PostMapping("/movimentos")
    public MovimentoEstoque registrarMovimento(@RequestBody MovimentoEstoqueRequest requisicao) {
        throw new UnsupportedOperationException("TODO");
    }

    @GetMapping("/saldo/{produtoId}")
    public BigDecimal consultarSaldoProduto(@PathVariable Long produtoId) {
        throw new UnsupportedOperationException("TODO");
    }

    @GetMapping("/extrato/{loteId}")
    public List<MovimentoEstoque> extrato(@PathVariable Long loteId) {
        throw new UnsupportedOperationException("TODO");
    }

    @GetMapping("/vencimentos")
    public List<Lote> listarProximosDoVencimento(@RequestParam int dias) {
        throw new UnsupportedOperationException("TODO");
    }

}
