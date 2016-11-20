/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareacoches;

import javax.swing.JFrame;
import tareacoches.vistas.Vista;

/**
 *
 * @author samo_
 */
public class TareaCoches {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Vista v = new Vista();
        JFrame ventana = new JFrame("Gestión de Coches");
        
        ventana.add(v);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.pack();
        ventana.setVisible(true);
        
    }
    
}
