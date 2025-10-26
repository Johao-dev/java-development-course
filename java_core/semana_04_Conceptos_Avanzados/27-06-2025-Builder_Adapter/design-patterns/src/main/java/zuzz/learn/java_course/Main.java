package zuzz.learn.java_course;

import java.util.ArrayList;
import java.util.List;

import zuzz.learn.java_course.builder.Casa;
import zuzz.learn.java_course.builder.Estatua;
import zuzz.learn.java_course.builder.Jardin;
import zuzz.learn.java_course.builder.Pared;
import zuzz.learn.java_course.builder.Piscina;
import zuzz.learn.java_course.builder.Piso;
import zuzz.learn.java_course.builder.Puerta;

@SuppressWarnings("unused")
public class Main {
    public static void main(String[] args) {
        List<Pared> paredes = new ArrayList<>();

        Casa casaNormal = new Casa.Builder()
            .construirParedes(paredes)
            .construirPiso(new Piso())
            .construirPuerta(new Puerta())
            .build();

        Casa casaConJardin = new Casa.Builder()
            .construirParedes(paredes)
            .construirPiso(new Piso())
            .construirPuerta(new Puerta())
            .construirJardin(new Jardin())
            .build();

        Casa casaConPiscina = new Casa.Builder()
            .construirParedes(paredes)
            .construirPiso(new Piso())
            .construirPuerta(new Puerta())
            .construirPiscina(new Piscina())
            .build();

        Casa casaConEstatua = new Casa.Builder()
            .construirParedes(paredes)
            .construirPiso(new Piso())
            .construirPuerta(new Puerta())
            .construirEstatua(new Estatua())
            .build();

        Casa casaCompleta = new Casa.Builder()
            .construirParedes(paredes)
            .construirPiso(new Piso())
            .construirPuerta(new Puerta())
            .construirEstatua(new Estatua())
            .construirJardin(new Jardin())
            .construirPiscina(new Piscina())
            .build();

        // Casa casaCompleta2 = new Casa(4, 1, 2, true, true, true);
    }
}