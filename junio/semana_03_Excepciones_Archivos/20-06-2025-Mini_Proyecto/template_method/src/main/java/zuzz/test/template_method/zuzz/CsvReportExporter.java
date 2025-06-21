package zuzz.test.template_method.zuzz;

/**
 *
 * @author zuzzDev
 */
public class CsvReportExporter extends ReportExporter {
    
    @Override
    public void writeData() {
        System.out.println("Writing data on CSV ...");
    }
}
