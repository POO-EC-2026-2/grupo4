// Orquestração de fluxos de negócio no front (sem DOM): combina chamadas de API.
import { lotesApi } from '../api/lotesApi.js';
import { producaoApi } from '../api/producaoApi.js';
import { pedidosApi } from '../api/pedidosApi.js';
import { entregasApi } from '../api/entregasApi.js';
import { rastreioApi } from '../api/rastreioApi.js';

export const fluxos = {
  // Colheita -> recebimento do produtor -> lote com saldo em estoque
  receberColheita(dados) { throw new Error('TODO'); },
  // Ordem de produção: criar -> iniciar -> etapas -> concluir (gera lote final)
  executarProducao(ordem, etapas, quantidadeProduzida) { throw new Error('TODO'); },
  // Pedido: criar -> confirmar (aloca lotes) -> agendar entrega
  fecharPedido(pedido, dataPrevista, entregador) { throw new Error('TODO'); },
  // Entrega: iniciar rota -> confirmar / registrar ocorrência
  concluirEntrega(entregaId, ocorrencia) { throw new Error('TODO'); },
  // Rastreio completo: produtor -> lote -> produção -> pedido -> cliente
  rastrearProdutoAteCliente(codigoLote) { throw new Error('TODO'); },
};
