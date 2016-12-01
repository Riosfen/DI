/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotablabd.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;



/**
 *
 * @author samo_
 */
public class ModeloBaseDatos {

    private String baseDatos, login, password;
    private Connection conector;
    private Statement sentencia;
    private ResultSet resultado;
    

    public void conectar(String base, String usu, String contr) throws ClassNotFoundException, SQLException {
        baseDatos = base;
        login = usu;
        password = contr;
        Class.forName("com.mysql.jdbc.Driver");
        conector = DriverManager.getConnection("jdbc:mysql://Localhost/"+baseDatos, login, password);
    }

    public void sentencia() throws SQLException {
        sentencia = conector.createStatement();
    }
    
    public ResultSet consulta( String consul) throws SQLException{
        System.out.println( "conectado");
        resultado = sentencia.executeQuery(consul);
        return resultado;
    }
    
    public int modificar (String modif) throws SQLException{
        return sentencia.executeUpdate(modif);
    }
    public ResultSetMetaData getMetadatos() throws SQLException{
        return resultado.getMetaData();
    }
    
    public void cerrar() throws SQLException{
        sentencia.close();
        conector.close();
    }

}
