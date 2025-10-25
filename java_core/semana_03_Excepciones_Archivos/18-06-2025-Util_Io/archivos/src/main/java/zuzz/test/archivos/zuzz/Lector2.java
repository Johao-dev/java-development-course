package zuzz.test.archivos.zuzz;

import java.io.File;

/**
 *
 * @author zuzzDev
 */
public class Lector2 {
    
    public static void main(String[] args) {
        File directorio = new File("mensajes/");
        String[] archivosDentroDeDirectorio = directorio.list();
        
        for (String archivosDentroDeDirectorio1 : archivosDentroDeDirectorio) {
            System.out.println(archivosDentroDeDirectorio1);
        }
    }
}
