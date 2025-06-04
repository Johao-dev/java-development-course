package zuzz.test.poo.polimorfismo;

public class Perro implements Animal {
    
    // implementar el contrato
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra");
    }
}
