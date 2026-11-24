# Gestão de Produção Rural — esqueleto (Java MVC + JavaScript)

Back-end Java (Spring Boot, camadas MVC) e camada JS de acesso à API. Sem UI.

## Camadas
- `model/` — entidades e regras de domínio (Model)
- `controller/` — endpoints REST em `/api/*` (Controller)
- `service/` — regras de negócio; os controllers só delegam
- `repository/` — contratos de persistência
- `dto/`, `exception/` — transporte de dados e erros
- `static/js/api/` — um módulo por recurso; `static/js/controllers/fluxos.js` orquestra fluxos

## Rastreabilidade
Produtor -> Lote (recebimento) -> OrdemProducao (consome lotes, gera novo lote com `lotesOrigem`)
-> ItemPedido (`lotesAlocados`, PEPS) -> Pedido -> Entrega -> Cliente.
`EventoRastreio` registra cada passo; `RastreabilidadeService` consulta origem, destino e pedidos afetados (recall).

## Estoque, preço e custo
- Estoque = saldo por Lote, alterado só via `MovimentoEstoque` (entrada, saída, ajuste, perda, consumo).
- Custo do lote = custo de recebimento ou soma dos custos da ordem (insumos + mão de obra + outros) / quantidade produzida.
- Preço vigente por produto com histórico; sugestão = custo unitário + margem.
