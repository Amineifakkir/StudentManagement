/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfe.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Electronic Store
 */
public class EmployeeNtic {
    AllConnection ac = new AllConnection();
        public int LoginCheckAdmin(String Matricule,String password){
        try{

//            String mtrl = Matricule.getText();
//           String  pass = Password.getText();
           String  req2 = "Select idAdmin , password from admin  where idAdmin = "+ Matricule+ " and password = "+password;
           String req ="select idProf , password from prof  where idProf = "+Matricule+ " and password = "+password;
           
           ResultSet rs = ac.executerSelect(req);
           ResultSet rs2 = ac.executerSelect(req2);

            if(rs.next()){
                System.out.println("admin");
                return rs.getInt("idAdmin");
            }else if(rs2.next()){
                
                return rs2.getInt("idprof");
            }
            
        }catch(Exception ex){
            System.out.println(ex);
        }
        
        return -1;
    }
    
}
