/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotpv;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author samo_
 */
public class ProyectoTPV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Toolkit t = Toolkit.getDefaultToolkit();
        //Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        JFrame ventana = new JFrame();
        BigPanel panel = new BigPanel(ventana, Color.BLUE);
        
        panel.setOcultarBarraTitulo(ventana);
        
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setExtendedState(JFrame.MAXIMIZED_BOTH);
        ventana.setVisible(true);
        ventana.setResizable(false);
        
    }
    
}
