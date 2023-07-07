package model;

import java.sql.Connection;
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

public class A {

    public static void main(String[] args) {

        try {
            String filepath = "src//reports//test1.jrxml";
            JasperReport jr = JasperCompileManager.compileReport(filepath);

            HashMap parameters = new HashMap();

            Connection datasource =MYSQL.getConnection();

            
            JasperPrint jp = JasperFillManager.fillReport(jr, parameters, datasource);
            JasperViewer.viewReport(jp,false);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
