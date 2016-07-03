/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author alan2
 */
public class DBConexion {
    Connection conn=null;        
    public Connection conectar() {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/SAT", "admin", "123456");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBConexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }

    public void cerrar() throws SQLException {
        if (conn != null) {
            conn.close();
        }
    }
}
