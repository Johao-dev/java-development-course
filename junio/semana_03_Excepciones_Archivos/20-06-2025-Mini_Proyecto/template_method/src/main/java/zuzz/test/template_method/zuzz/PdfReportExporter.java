package zuzz.test.template_method.zuzz;

/**
 *
 * @author zuzzDev
 */
public class PdfReportExporter extends ReportExporter {
    
    // solo implementa los pasos que pueden variar
    // dejando los compartidos en la clase base.
    // Evitando escribir codigo duplicado.
    @Override
    public void writeData() {
        System.out.println("Writing data on PDF ...");
    }
}
