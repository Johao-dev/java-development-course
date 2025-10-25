package zuzz.test.template_method.zuzz;

/**
 *
 * @author zuzzDev
 */
public class ExcelReportExporter extends ReportExporter {
    
    @Override
    public void writeData() {
        System.out.println("Writing data on Excel ...");
    }
}
