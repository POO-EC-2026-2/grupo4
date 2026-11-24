package br.com.gestaorural.repository;

import java.math.BigDecimal;
import java.time.*;
import java.util.*;
import br.com.gestaorural.model.*;
import br.com.gestaorural.model.enums.*;

public interface ProdutoRepository extends Repositorio<Produto, Long> {
    List<Produto> buscarPorTipo(TipoProduto tipo);
}
