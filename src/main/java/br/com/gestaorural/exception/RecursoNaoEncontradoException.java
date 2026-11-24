package br.com.gestaorural.exception;

/** Entidade não encontrada. */
public class RecursoNaoEncontradoException extends RuntimeException {
    public RecursoNaoEncontradoException(String mensagem) { super(mensagem); }
}
