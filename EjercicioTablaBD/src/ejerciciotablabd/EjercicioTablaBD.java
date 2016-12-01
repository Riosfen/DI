/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotablabd;

import ejerciciotablabd.controlador.Controlador;
import ejerciciotablabd.modelo.ModeloBaseDatos;
import ejerciciotablabd.vista.Vista;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author samo_
 */
public class EjercicioTablaBD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        EjercicioTablaBD p = new EjercicioTablaBD();
        JFrame ventana = new JFrame("Libreria");
        Vista vista = new Vista();
        ModeloBaseDatos modelo = new ModeloBaseDatos();
        Controlador controlador = new Controlador(ventana, modelo, vista);
        
        vista.addControlador(controlador);
        
        ventana.add(vista);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.pack();
        ventana.setIconImage (new ImageIcon(p.getClass().getResource("Libros.gif")).getImage());
        ventana.setVisible(true);
        
    }
    
}
