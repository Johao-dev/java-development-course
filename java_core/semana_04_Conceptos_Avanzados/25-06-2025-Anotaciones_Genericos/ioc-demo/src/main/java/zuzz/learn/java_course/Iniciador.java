package zuzz.learn.java_course;

public class Iniciador {

    public static void main(String[] args) {
        // 1. Crea una instancia de tu manejador de anotaciones
        MetodoPrincipalManejador manejador = new MetodoPrincipalManejador();

        // 2. Dile al manejador que procese la clase 'Main'
        // Le pasamos la clase que queremos escanear (Main.class)
        // y los argumentos de la línea de comandos (args).
        manejador.procesar(Main.class, args);
    }
}
