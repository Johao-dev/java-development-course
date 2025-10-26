package zuzz.learn.java_course.adapter;

public class FuncionalidadAntiguaAdapter implements FuncionalidadAntigua {

    private Hibernate hibernate = new Hibernate();

    public void procesarPedidos() {
        System.out.println("Integrando nueva funcionalidad");
        hibernate.conectar();
    }
}
