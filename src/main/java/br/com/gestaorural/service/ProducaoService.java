package br.com.gestaorural.service;

import java.math.BigDecimal;
import java.time.*;
import java.util.*;
import br.com.gestaorural.dto.*;
import br.com.gestaorural.model.*;
import br.com.gestaorural.model.enums.*;
import br.com.gestaorural.repository.*;
import br.com.gestaorural.exception.*;

@org.springframework.stereotype.Service
public class ProducaoService {

    // TODO: injetar repositórios/serviços necessários via construtor

    public OrdemProducao criarOrdem(OrdemProducaoRequest requisicao) {
        throw new UnsupportedOperationException("TODO");
    }

    public OrdemProducao iniciar(Long ordemId) {
        throw new UnsupportedOperationException("TODO");
    }

    public EtapaPreparo registrarEtapa(Long ordemId, EtapaPreparo etapa) {
        throw new UnsupportedOperationException("TODO");
    }

    public void consumirInsumos(Long ordemId) {
        throw new UnsupportedOperationException("TODO");
    }

    public OrdemProducao concluir(Long ordemId, BigDecimal quantidadeProduzida) {
        throw new UnsupportedOperationException("TODO");
    }

    public void cancelar(Long ordemId) {
        throw new UnsupportedOperationException("TODO");
    }

    public OrdemProducao buscar(Long ordemId) {
        throw new UnsupportedOperationException("TODO");
    }

    public List<OrdemProducao> listarPorStatus(StatusOrdem status) {
        throw new UnsupportedOperationException("TODO");
    }

}
