package zuzz.test.strategypattern;

public class Exportador {

    // dependencia
    private final GeneradorArchivo generador;
    
    public Exportador(GeneradorArchivo generador) {
        this.generador = generador;
    }
    
    public Archivo generar(String contenido) {
        return generador.generarArchivo(contenido);
    }
    
    public static void main(String[] args) {
        // contenido a mostrar en el archivo
        String contenido = "Archivo nuevo en la ruta ...";
        
        // estrategia a usar
        GeneradorArchivo generador = new GeneradorArchivoDocx();
        
        // cliente que usa la estrategia abstracta
        Exportador exportador = new Exportador(generador);
        Archivo archivoGenerado = exportador.generar(contenido);
        
        // ver informacion
        System.out.println(archivoGenerado.verContenido());
    }
}
