package br.com.gestaorural.repository;

import java.util.*;

/** Contrato genérico de persistência (implementar com JPA/JDBC). */
public interface Repositorio<T, ID> {
    T salvar(T entidade);
    Optional<T> buscarPorId(ID id);
    List<T> listarTodos();
    void remover(ID id);
}
