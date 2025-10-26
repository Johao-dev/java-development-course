package zuzz.learn.java_course;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MetodoPrincipalManejador {

    public void procesar(Class<?> clazz, String[] args) {

        // 1. Obtener todos los métodos declarados en la clase
        Method[] metodos = clazz.getDeclaredMethods();

        // 2. Iterar sobre ellos
        for (Method metodo : metodos) {

            // 3. Comprobar si el método TIENE la anotación que buscamos
            if (metodo.isAnnotationPresent(MetodoPrincipal.class)) {

                // ¡Encontrado! Mostramos el mensaje por consola
                System.out.println("== ANOTACIÓN PROCESADA ==");
                System.out.println("Se encontró @MetodoPrincipal en el método: " + metodo.getName());
                System.out.println("Iniciando ejecución...");
                System.out.println("==========================");

                try {
                    // 4. Invocar el método encontrado
                    // Como el 'main' original es estático, pasamos 'null' como instancia.
                    // 'args' debe pasarse como un solo objeto (ya que el método espera un String[])
                    metodo.invoke(null);

                } catch (IllegalAccessException | InvocationTargetException e) {
                    System.err.println("Error al invocar el método anotado:");
                    e.printStackTrace();
                }

                // Salimos del bucle si ya encontramos el método principal
                return;
            }
        }

        System.err.println(
                "No se encontró ningún método anotado con @MetodoPrincipal en la clase " + clazz.getSimpleName());
    }
}
