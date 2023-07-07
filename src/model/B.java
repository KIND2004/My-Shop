package model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Vector;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

public class B {

    public static void main(String[] args) {

        try {
            String filepath = "src//reports//mytest.jrxml";
            JasperReport jr = JasperCompileManager.compileReport(filepath);

            HashMap parameters = new HashMap();
//            parameters.put("Parameter1", "Bimsara");
//            Date d = new Date();
//            SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
//            
//            parameters.put("Parameter2", sdf.format(d));
            Vector v = new Vector();
            for (int i = 0; i < 2; i++) {
                // User u[i] = new User(1, "Sahan", "123");
                // User u2 = new User(2, "Prabath", "456");
                // User u3 = new User(3, "Hashan", "789");

                //v.add(u1);
                // v.add(u2);
             //   v.add(new User(i, "Sahan", "123"));

            }
            JRBeanCollectionDataSource datasource = new JRBeanCollectionDataSource(v);
            JasperPrint jp = JasperFillManager.fillReport(jr, parameters, datasource);
            JasperViewer.viewReport(jp);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
