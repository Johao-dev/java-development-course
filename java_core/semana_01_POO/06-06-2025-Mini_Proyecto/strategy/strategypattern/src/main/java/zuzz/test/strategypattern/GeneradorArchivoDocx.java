package zuzz.test.strategypattern;

// Algoritmo para generar archivos .docx
public class GeneradorArchivoDocx implements GeneradorArchivo {
    
    @Override
    public Archivo generarArchivo(String contenido) {
        System.out.println("Generando archivo docx");
        Archivo archivo = new Archivo(contenido);
        return archivo;
    }
}
