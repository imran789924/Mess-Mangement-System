/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mess.management.system;

import java.sql.DriverManager;
import java.sql.*;

/**
 *
 * @author DCL
 */
public class MessManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connection connection = null;
        
        try{
            String driverName = "oracle.jdbc.driver.OracleDriver";
            Class.forName(driverName);
            String serverName = "DESKTOP-A5U3RHS";
            String serverPort = "1521";
            String sid = "ORCL";
            String url = "jdbc:oracle:thin:@" + serverName + ":" + serverPort + ":" + sid;
            String userName = "hr";
            String password = "hr";
            connection = DriverManager.getConnection(url, userName, password);
            System.out.println("Successfully Connected to the Database!");
           
        } catch(ClassNotFoundException e){
            System.out.println("Could not find the database driver " + e.getMessage());
        } catch(SQLException e){
            System.out.println("Could not connect to the database " + e.getMessage());
        }
        
        
//        try{
//            Statement st = connection.createStatement();
//            ResultSet rs = st.executeQuery("Select * from COUNTRIES");
//            while(rs.next()){
//                int id = rs.getInt(3);
//                String code = rs.getString(1).toString();
//                System.out.println("" + id + ": " + code + "");
//            }
//            rs.close();
//        } catch(Exception e) {
//            e.printStackTrace();
//        }
//        
        LogInPage lip = new LogInPage();
        lip.setVisible(true);
        
//        
    }
    
}
