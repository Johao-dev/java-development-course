package zuzz.test.template_method.zuzz;

/**
 *
 * @author zuzzDev
 */
public class Client {
    
    public static void main(String[] args) {
        
        ReportExporter pdf = new PdfReportExporter();
        ReportExporter csv = new CsvReportExporter();
        ReportExporter excel = new ExcelReportExporter();
        
        // Polimorfismo en accion!
        pdf.exportReport();
        csv.exportReport();
        excel.exportReport();
    }
}
