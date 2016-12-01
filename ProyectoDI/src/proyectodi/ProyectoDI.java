/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodi;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import proyectodi.controlador.Controlador;
import proyectodi.vista.Vista;

/**
 *
 * @author alumno2damdiurno
 */
public class ProyectoDI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JFrame ventana = new JFrame();
        Dimension resolucion = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
        
        Controlador controladorVista = new Controlador();
        Vista vista = new Vista();
        
        vista.addControladror(controladorVista);
        
        ventana.add(vista);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(resolucion.width, resolucion.height);
        ventana.setResizable(false);
        ventana.setUndecorated(true);
        ventana.setVisible(true);
        
    }
    
}
