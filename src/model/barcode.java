
package model;

import java.util.HashMap;
import java.util.Vector;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;


public class barcode {
    public static void main(String[] args) {
        try {
            JasperReport jr=   JasperCompileManager.compileReport("src/reports/bar.jrxml");
            HashMap parameters =new HashMap();
            
            Vector v =new Vector();
            v.add(new X("55"));
             v.add(new X("10"));
              v.add(new X("20"));
            JRBeanCollectionDataSource datasource =new JRBeanCollectionDataSource(v);
            JasperPrint jp =JasperFillManager.fillReport(jr, parameters,datasource);
            
            JasperViewer.viewReport(jp);
        } catch (Exception e) {
        }
    }
}


