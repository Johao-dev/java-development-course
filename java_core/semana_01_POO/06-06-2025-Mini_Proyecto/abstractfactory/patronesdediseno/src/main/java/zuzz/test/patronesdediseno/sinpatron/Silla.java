package zuzz.test.patronesdediseno.sinpatron;

public class Silla {

    private final String variante;
    
    // constructor
    public Silla(String variante) {
        this.variante = variante;
    }
    
    @Override
    public String toString() {
        return "Silla: " + variante;
    }
    
    // metodo
//    public void Silla(String variante) {
//        this.variante = variante;
//    }
}
