package zuzz.tests.spring_data_jpa_ejercicio.controladores;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import zuzz.tests.spring_data_jpa_ejercicio.controladores.excepciones.AutorNoEncontradoException;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(AutorNoEncontradoException.class)
    public ResponseEntity<?> handleAutorNoEncontradoException(AutorNoEncontradoException ex) {
        return ResponseEntity.status(404).body(ex.getMessage());
    }
}
