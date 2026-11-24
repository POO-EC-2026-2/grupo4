package br.com.gestaorural.exception;

/** Saldo insuficiente para a operação. */
public class EstoqueInsuficienteException extends RuntimeException {
    public EstoqueInsuficienteException(String mensagem) { super(mensagem); }
}
