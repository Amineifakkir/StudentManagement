/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfe.classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Electronic Store 
 */
public class AllConnection {
    
    Statement st;
    public static ResultSet connection(){
          try {
            Class.forName("oracle.jdbc.OracleDriver");
            Connection cn =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "pff", "ntic");
            Statement st=cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
           
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public Statement getst(){
        return st;
    }
    
      public static ResultSet executerSelect(String req){
      ResultSet rs=null;
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            Connection cn =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "pff", "ntic");
            Statement st=cn.createStatement();
            rs=st.executeQuery(req);
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return rs;
    }
    
     public static int executerMAJ(String req){
      int rs=-1;
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            Connection cn =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "pff", "ntic");
            Statement st=cn.createStatement();
            rs=st.executeUpdate(req);
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return rs;
    }
    
}
