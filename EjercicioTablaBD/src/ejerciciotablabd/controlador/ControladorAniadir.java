/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotablabd.controlador;

import ejerciciotablabd.modelo.ModeloBaseDatos;
import ejerciciotablabd.vista.VistaAniadirLibro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author samo_
 */
public class ControladorAniadir implements ActionListener {

    private ModeloBaseDatos modelo;
    private VistaAniadirLibro vistaAniadir;
    
    public ControladorAniadir(ModeloBaseDatos modelo, VistaAniadirLibro vistaAniadir){
        
        this.vistaAniadir = vistaAniadir;
        this.modelo = modelo;
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    
        switch(e.getActionCommand()){
        
            case "aniadir":
                try {
                    modelo.conectar("bibliografia", "root", "123456");
                    modelo.sentencia();
                    
                    
                    
                } catch (ClassNotFoundException er) {
                    JOptionPane.showMessageDialog(vistaAniadir, er.getMessage(), "Error al realizar la conexion", JOptionPane.ERROR_MESSAGE);
                } catch (SQLException sqle){
                    JOptionPane.showMessageDialog(vistaAniadir, sqle.getMessage(), "Error al realizar las consultas", JOptionPane.ERROR_MESSAGE);
                }
                
                break;
        }
        
    }
    
}
