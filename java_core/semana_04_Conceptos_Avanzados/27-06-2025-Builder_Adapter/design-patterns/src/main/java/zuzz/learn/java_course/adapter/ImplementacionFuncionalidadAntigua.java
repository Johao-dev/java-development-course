package zuzz.learn.java_course.adapter;

public class ImplementacionFuncionalidadAntigua implements FuncionalidadAntigua {

    private EclipseLink eclipseLink = new EclipseLink();

    @Override
    public void procesarPedidos() {
        System.out.println("Antigua forma de manipular los datos en una bd");
        eclipseLink.conectar();
    }
}
