package zuzz.tests.spring_data_jpa_ejercicio.controladores.excepciones;

public class AutorNoValidoException extends RuntimeException {

    public AutorNoValidoException(String mensaje) {
        super(mensaje);
    }
}
