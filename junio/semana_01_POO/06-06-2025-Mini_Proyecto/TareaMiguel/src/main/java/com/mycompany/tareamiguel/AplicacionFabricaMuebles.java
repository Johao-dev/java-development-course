package com.mycompany.tareamiguel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Aplicación de consola simplificada para mostrar catálogo dinámico
public class AplicacionFabricaMuebles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FabricaMuebles fabrica;
        List<String> catalogo = new ArrayList<>();

        // 1) Selección de estilo
        System.out.println("Elige estilo de muebles:");
        System.out.println("1) Moderno");
        System.out.println("2) Victoriano");
        int opEstilo = sc.nextInt();
        if (opEstilo == 1) {
            fabrica = new FabricaMueblesModerna();
        } else {
            fabrica = new FabricaMueblesVictoriana();
        }

        // 2) Crear muebles y añadir al catálogo
        boolean seguir = true;
        while (seguir) {
            System.out.println("\nElige mueble para crear:");
            System.out.println("1) Silla");
            System.out.println("2) Sofá");
            System.out.println("3) Mesa de centro");
            System.out.println("0) Salir");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    Silla silla = fabrica.crearSilla();
                    silla.describir();
                    catalogo.add(silla.obtenerNombre());
                    break;
                case 2:
                    Sofa sofa = fabrica.crearSofa();
                    sofa.describir();
                    catalogo.add(sofa.obtenerNombre());
                    break;
                case 3:
                    MesaDeCentro mesa = fabrica.crearMesaDeCentro();
                    mesa.describir();
                    catalogo.add(mesa.obtenerNombre());
                    break;
                case 0:
                    seguir = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

            // Mostrar catálogo actualizado
            System.out.println("\n--- Catálogo de muebles creados: ---");
            for (int i = 0; i < catalogo.size(); i++) {
                System.out.println((i + 1) + ") " + catalogo.get(i));
            }
        }

        sc.close();
        System.out.println("Aplicación finalizada.");
    }
}
