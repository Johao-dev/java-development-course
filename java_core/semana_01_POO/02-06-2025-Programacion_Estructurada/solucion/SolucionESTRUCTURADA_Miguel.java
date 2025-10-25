import java.util.ArrayList;
import java.util.Scanner;

class SolucionESTRUCTURADA_Miguel {
    public static void main(String[] args) {
        String nombre;
        String telefono;
        Scanner sc = new Scanner(System.in);

        ArrayList<String> contacto = new ArrayList<>();
        int opcion;
        do {

            System.out.println("Opcion 1: Agregar contacto");
            System.out.println("Opcion 2: Buscar contacto");
            System.out.println("Opcion 3: Mostrar todos los contactos");
            System.out.println("Opcion 4: Eliminar contacto");
            System.out.println("Opcion 5: Salir");
            System.out.println("Bienvenido, Escoga una opcion:");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.println("Ingrese su nombre:");
                    nombre = sc.nextLine();

                    System.out.println("Ingrese su teléfono:");
                    telefono = sc.nextLine();

                    contacto.add(nombre + " " + telefono);
                    System.out.println("Contacto creado:\n");
                    break;

                case 2:
                    System.out.println("Ingrese el nombre del contacto que desea buscar:");
                    String nombreBusqueda = sc.nextLine();

                    boolean encontrado = false;
                    for (String c : contacto) {
                        if (c.startsWith(nombreBusqueda)) {
                            System.out.println("Contacto encontrado:\n" + c);
                            encontrado = true;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("No existe contacto con ese nombre");
                    }
                    break;

                case 3:
                    for (int i = 0; i < contacto.size(); i++) {
                        System.out.println(contacto.get(i));
                    }
                    break;

                case 4:
                    System.out.println("Ingrese el nombre del contacto que desea eliminar:");
                    String nombreEliminar = sc.nextLine();

                    boolean eliminado = false;
                    for (int i = 0; i < contacto.size(); i++) {
                        if (contacto.get(i).startsWith(nombreEliminar)) {
                            contacto.remove(i);
                            System.out.println("Contacto eliminado:\n");
                            eliminado = true;
                            break;
                        }
                    }
                    if (!eliminado) {
                        System.out.println("No existe contacto con ese nombre");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida, intente de nuevo.");
            }

        } while (opcion != 5);

        sc.close();
    }
}
