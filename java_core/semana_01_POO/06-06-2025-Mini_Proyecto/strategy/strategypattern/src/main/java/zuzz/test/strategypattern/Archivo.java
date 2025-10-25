package zuzz.test.strategypattern;

public class Archivo {

    private final String contenido;
    
    public Archivo(String contenido) {
        this.contenido = contenido;
    }
    
    public String verContenido() {
        return contenido;
    }
}
