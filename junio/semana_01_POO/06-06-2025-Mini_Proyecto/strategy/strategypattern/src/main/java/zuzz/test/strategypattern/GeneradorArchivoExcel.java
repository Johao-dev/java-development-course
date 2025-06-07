package zuzz.test.strategypattern;

// Algoritmo para generar archivos .xlsx
public class GeneradorArchivoExcel implements GeneradorArchivo {

    @Override
    public Archivo generarArchivo(String contenido) {
        System.out.println("Generando archivo excel");
        Archivo archivo = new Archivo(contenido);
        return archivo;
    }
}
