package zuzz.test.strategypattern;

// Algoritmo para generar archivos .pdf
public class GeneradorArchivoPdf implements GeneradorArchivo {
    
    @Override
    public Archivo generarArchivo(String contenido) {
        System.out.println("Generando archivo pdf");
        Archivo archivo = new Archivo(contenido);
        return archivo;
    }
}
