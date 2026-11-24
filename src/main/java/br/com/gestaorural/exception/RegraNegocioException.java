package br.com.gestaorural.exception;

/** Violação de regra de negócio. */
public class RegraNegocioException extends RuntimeException {
    public RegraNegocioException(String mensagem) { super(mensagem); }
}
