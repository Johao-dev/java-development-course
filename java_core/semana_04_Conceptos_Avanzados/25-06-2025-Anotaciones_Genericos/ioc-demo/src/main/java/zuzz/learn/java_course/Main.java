package zuzz.learn.java_course;

@SuppressWarnings("unused")
public class Main {
    
    public static void main(String[] args) {
        Motor motor = new MotorGasolina();
        
        // inyectamos motor en coche
        Coche coche1 = new Coche(motor);
    }
    
    public Main() {
        
    }
    
    // @Logging()
    public void metodo1() {
        // logica de negocio
    }
    
    @MetodoPrincipal()
    public void metodo2() {

    }

    public void metodo3() {

    }
}