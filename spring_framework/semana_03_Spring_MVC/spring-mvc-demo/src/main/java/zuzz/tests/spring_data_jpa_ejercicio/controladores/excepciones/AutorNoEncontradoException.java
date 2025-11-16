package zuzz.tests.spring_data_jpa_ejercicio.controladores.excepciones;

public class AutorNoEncontradoException extends RuntimeException {

    public AutorNoEncontradoException(String mensaje) {
        super(mensaje);
    }
}
