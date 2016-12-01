/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciomostrartabla;

import ejerciciomostrartabla.vista.Vista;
import javax.swing.JFrame;

/**
 *
 * @author samo_
 */
public class EjercicioMostrarTabla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JFrame ventana = new JFrame("Trabajar con tabla");
        Vista vista = new Vista();
        
        ventana.add(vista);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.pack();
        ventana.setVisible(true);
        
    }
    
}
