package zuzz.test.poo.staticfinal;

// Software para TOYOTA
public class Auto {

    // constante
    public static final String MARCA = "TOYOTA";

    // inmutable
    public final String modelo;

    // constructor
    public Auto(String modelo) {
        this.modelo = modelo;
    }
}
