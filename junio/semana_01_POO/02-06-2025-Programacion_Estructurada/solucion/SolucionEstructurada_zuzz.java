import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SolucionEstructurada_zuzz {
    private String nombre;
    private String telefono;
    private static Scanner sc = new Scanner(System.in);

    private List<String> contactos = new ArrayList<>();

    public static void main(String[] args) {
        var solucion = new SolucionEstructurada_zuzz();
        boolean salir = false;

        while (!salir) {
            solucion.mostrarMenu();
            var opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    solucion.agregarContacto();
                    break;
                case 2:
                    solucion.buscarContacto();
                    break;
                case 3:
                    solucion.mostrarAgenda();
                    break;
                case 4:
                    solucion.eliminarContacto();
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }

    public void mostrarMenu() {
        System.out.println("1. Agregar contacto");
        System.out.println("2. Buscar contacto");
        System.out.println("3. Mostrar agenda");
        System.out.println("4. Eliminar contacto");
        System.out.println("5. Salir");
    }

    public void agregarContacto() {
        System.out.print("Ingrese nombre:");
        nombre = sc.nextLine();
        System.out.print("Ingrese telefono:");
        telefono = sc.nextLine();

        contactos.add(nombre + " (" + telefono + ")");
    }

    public void buscarContacto() {
        System.out.print("Ingrese nombre: ");
        String nombreBuscado = sc.nextLine();

        if (contactos.contains(nombreBuscado)) {
            System.out.println(nombreBuscado + " encontrado");
        } else {
            System.out.println(nombreBuscado + " no encontrado");
        }
    }

    public void eliminarContacto() {
        System.out.print("Ingrese nombre:");
        String nombreEliminado = sc.nextLine();

        if (contactos.contains(nombreEliminado)) {
            contactos.remove(nombreEliminado);
            System.out.println(nombreEliminado + " eliminado");
        } else {
            System.out.println(nombreEliminado + " no encontrado");
        }
    }

    public void mostrarAgenda() {
        System.out.println("Agenda:");
        for (String contacto : contactos)
            System.out.println(contacto);
    }
}
