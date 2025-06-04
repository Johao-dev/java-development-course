package zuzz.test.poo.staticfinal;

public class Main {

    public static void main(String[] args) {
        Persona juan = new Persona();
        juan.nombre = "Juan";
        
        System.out.println("juan = " + juan.nombre);
        System.out.println(Persona.especie);
        
        Persona.comer();
    }
}
