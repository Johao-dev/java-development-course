package zuzz.test.template_method.zuzz;

/**
 *
 * @author zuzzDev
 */
public abstract class ReportExporter {
    
    // metodo plantilla - template method
    public final void exportReport() {
        
        // pasos del algoritmo
        openFile();
        writeHeaders();
        writeData();
        closeFile();
    }
    
    // pasos compartidos o similares
    public void openFile() {
        System.out.println("Opening file ...");
    }
    
    public void writeHeaders() {
        System.out.println("Writing headers on report ....");
    }
    
    public void closeFile() {
        System.out.println("Closing file ...");
    }
    
    // paso que puede variar
    public abstract void writeData();
}
