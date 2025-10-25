package zuzz.test.archivos.zuzz;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author zuzzDev
 */
public class LectorArchivo {
    
    public static void main(String[] args) {
        // representacion del archivo
        File archivo = new File("pato.txt");
        System.out.println(archivo.canExecute());
        System.out.println(archivo.canRead());
        System.out.println(archivo.canWrite());
        
        System.out.println(archivo.exists());
        System.out.println("Ruta absoluta" + archivo.getAbsolutePath());
//        System.out.println("Ruta canonica" + archivo.getCanonicalPath());
        System.out.println("Ruta relativa: " + archivo.getPath());
        System.out.println("Directorio padre?: " + archivo.getParent());
        System.out.println("Longitud del archivo" + archivo.length());
//        System.out.println(archivo.renameTo(new File("pato.txt")));
        
        // intentamos leer el archivo
//        try {
//            // leyendo el archivo
//            Scanner lector = new Scanner(archivo);
//            
//            while (lector.hasNextLine()) {
//                String linea = lector.nextLine();
//                System.out.println("linea = " + linea);
//            }
//            
//            lector.close();
//            
//        } catch (IOException ex) { // puede que el archivo no existe
//            ex.printStackTrace(System.err);
//        }
    }
}
