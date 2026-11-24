package br.com.gestaorural.exception;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RecursoNaoEncontradoException.class)
    public ResponseEntity<String> naoEncontrado(RecursoNaoEncontradoException e) {
        throw new UnsupportedOperationException("TODO");
    }

    @ExceptionHandler({RegraNegocioException.class, EstoqueInsuficienteException.class})
    public ResponseEntity<String> regraNegocio(RuntimeException e) {
        throw new UnsupportedOperationException("TODO");
    }
}
