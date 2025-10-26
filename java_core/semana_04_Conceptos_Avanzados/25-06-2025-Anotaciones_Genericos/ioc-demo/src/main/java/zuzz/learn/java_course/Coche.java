package zuzz.learn.java_course;

@SuppressWarnings("unused")
public class Coche {

    private Motor motor;

    // inyeccion de dependencia por constructor
    public Coche(Motor motor) {
        this.motor = motor;
    }
}
