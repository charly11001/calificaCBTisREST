/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 *
 * @author Juan Carlos
 */
public class ConexionBD {
    static ConexionBD instance;
    private Connection connection;
    private ConexionBD(){
        try {
            Context context=new InitialContext();
            DataSource ds=(DataSource) context.lookup("java:app/jdbc/inscripcionBD_SOA");
            connection=ds.getConnection();
            System.out.println("Conectado con la BD!!!!!");
        } catch (NamingException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    static public ConexionBD getInstance(){
        if(instance==null){
            instance=new ConexionBD();
        }
        return instance;
    }
    public Connection getConnection(){
        return connection;
    }
    public void cerrar(){
        try {
            connection.close();
            instance=null;
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

