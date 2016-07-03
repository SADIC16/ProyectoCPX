/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alan2
 */
public class Consultas {
    Connection con=null;
    public Consultas(Connection con){
        this.con=con;
    }

    public ResultSet ExecuteQuery(String query) {
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);              
            return rs;                          
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public boolean Execute(String query) {
        try {
            Statement stmt = con.createStatement();
            boolean result=stmt.execute(query);                        
            stmt.close();
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
