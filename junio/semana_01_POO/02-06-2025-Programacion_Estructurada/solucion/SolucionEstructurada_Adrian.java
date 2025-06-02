import java.util.Scanner;

public class SolucionEstructurada_Adrian {
    public static void main(String[] args) {
        // Variables
        String nombre = "", buscar_nombre;
        int telefono = 0, opcion;
        String correo = "";
        int contactos_ingresados = 0;

        Scanner sc = new Scanner(System.in);

        do {
            // Menú
            System.out.println("\n|Sistema de Gestión de Contactos|\n");
            System.out.println("1.- Agregar un nuevo Contacto");
            System.out.println("2.- Buscar contacto por nombre");
            System.out.println("3.- Mostrar todos los contactos");
            System.out.println("4.- Eliminar un contacto");
            System.out.println("5.- Salir del programa");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar salto de línea pendiente

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese su nombre: ");
                    nombre = sc.nextLine();
                    System.out.print("Ingrese su teléfono: ");
                    telefono = sc.nextInt();
                    sc.nextLine(); // Limpiar salto
                    System.out.print("Ingrese su correo electrónico: ");
                    correo = sc.nextLine();
                    contactos_ingresados++;
                    System.out.println("¡Contacto agregado exitosamente!");
                    break;

                case 2:
                    System.out.print("Ingrese el nombre del contacto que desea buscar: ");
                    buscar_nombre = sc.nextLine();
                    if (buscar_nombre.equals(nombre)) {
                        System.out.println("Contacto encontrado exitosamente:");
                        System.out.println("Nombre: " + nombre);
                        System.out.println("Teléfono: " + telefono);
                        System.out.println("Correo: " + correo);
                    } else {
                        System.out.println("El contacto no existe o aún no se ha registrado.");
                    }
                    break;

                case 3:
                    System.out.println("Contactos registrados en el sistema: " + contactos_ingresados);
                    if (contactos_ingresados > 0) {
                        System.out.println("Nombre: " + nombre);
                        System.out.println("Teléfono: " + telefono);
                        System.out.println("Correo: " + correo);
                    }
                    break;

                case 4:
                    System.out.print("Ingrese el nombre del contacto que desea eliminar: ");
                    buscar_nombre = sc.nextLine();
                    if (buscar_nombre.equals(nombre)) {
                        nombre = "";
                        telefono = 0;
                        correo = "";
                        contactos_ingresados--;
                        System.out.println("Contacto eliminado exitosamente.");
                    } else {
                        System.out.println("El contacto no existe o aún no se ha registrado.");
                    }
                    break;

                case 5:
                    System.out.println("Gracias por usar mi sistema de gestión de contactos.");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }

        } while (opcion != 5);
    }
}
