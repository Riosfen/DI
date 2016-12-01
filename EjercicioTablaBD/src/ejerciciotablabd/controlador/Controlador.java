/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotablabd.controlador;

import ejerciciotablabd.modelo.ModeloBaseDatos;
import ejerciciotablabd.vista.Vista;
import ejerciciotablabd.vista.VistaAniadirLibro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author samo_
 */
public class Controlador implements ActionListener {

    private Vista vista;
    private ModeloBaseDatos modelo;
    private JFrame ventana;
    
    public Controlador(JFrame ventana, ModeloBaseDatos modelo, Vista vista){
        this.vista = vista;
        this.modelo = modelo;
        this.ventana = ventana;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    
        switch(e.getActionCommand()){
        
            case "ejecutar":
                
                try {
                    modelo.conectar("bibliografia", "root", "123456");
                    modelo.sentencia();
                    ResultSet resultado = modelo.consulta(vista.getTextInsertarcodigo());
                    
                } catch (ClassNotFoundException er) {
                    JOptionPane.showMessageDialog(vista, er.getMessage(), "Error al realizar la conexion", JOptionPane.ERROR_MESSAGE);
                } catch (SQLException sqle){
                    JOptionPane.showMessageDialog(vista, sqle.getMessage(), "Error al realizar las consultas", JOptionPane.ERROR_MESSAGE);
                }
                
                break;
            case "eliminar":
                break;
            case "aniadir":
                
                VistaAniadirLibro vistaAniadir = new VistaAniadirLibro();
                JDialog ventanaAniadir = new JDialog(ventana, "Añadir Libro");
                ControladorAniadir controlador = new ControladorAniadir(modelo, vistaAniadir);
                vistaAniadir.addControlador(controlador);
                
                ventanaAniadir.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                ventanaAniadir.add(vistaAniadir);
                ventanaAniadir.pack();
                ventanaAniadir.setVisible(true);
                
                break;
            case "salir":
                System.exit(0);
                break;
            
        }
        
    }
    
}
