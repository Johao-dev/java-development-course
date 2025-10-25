package zuzz.test.poo.polimorfismo;

public class Gato implements Animal {
    
    // implementar el contrato
    @Override
    public void hacerSonido() {
        System.out.println("El gato maulla");
    }
}
