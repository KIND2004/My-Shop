/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MYSQL {

    private static Connection c;
    private static final String USERNAME = "root";
    private static final String PASSWORD = "hanzdilu12345#";
    private static final String DATABASE = "shop";

    public static Statement createConnection() throws Exception {

        if (c == null) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + DATABASE, USERNAME, PASSWORD);
        }
        Statement s = c.createStatement();
        return s;

    }

    public static void iud(String query) {
        try {

            createConnection().executeUpdate(query);
        } catch (Exception e) {
            System.out.println("Connection Error");
        }

    }

    public static ResultSet search(String query) throws Exception {

        ResultSet r = createConnection().executeQuery(query);

        return r;

    }

    public static Connection getConnection() {
        if (c == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                c = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + DATABASE, USERNAME, PASSWORD);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return c;
    }

}
