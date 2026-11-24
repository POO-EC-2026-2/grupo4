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
@RequestMapping("/api/producao")
public class ProducaoController {

    private final ProducaoService service;

    public ProducaoController(ProducaoService service) {
        this.service = service;
    }

    @PostMapping("/ordens")
    public OrdemProducao criarOrdem(@RequestBody OrdemProducaoRequest requisicao) {
        throw new UnsupportedOperationException("TODO");
    }

    @PostMapping("/ordens/{id}/iniciar")
    public OrdemProducao iniciar(@PathVariable Long id) {
        throw new UnsupportedOperationException("TODO");
    }

    @PostMapping("/ordens/{id}/etapas")
    public EtapaPreparo registrarEtapa(@PathVariable Long id, @RequestBody EtapaPreparo etapa) {
        throw new UnsupportedOperationException("TODO");
    }

    @PostMapping("/ordens/{id}/concluir")
    public OrdemProducao concluir(@PathVariable Long id, @RequestParam BigDecimal quantidadeProduzida) {
        throw new UnsupportedOperationException("TODO");
    }

    @PostMapping("/ordens/{id}/cancelar")
    public void cancelar(@PathVariable Long id) {
        throw new UnsupportedOperationException("TODO");
    }

    @GetMapping("/ordens/{id}")
    public OrdemProducao buscar(@PathVariable Long id) {
        throw new UnsupportedOperationException("TODO");
    }

    @GetMapping("/ordens")
    public List<OrdemProducao> listarPorStatus(@RequestParam StatusOrdem status) {
        throw new UnsupportedOperationException("TODO");
    }

}
