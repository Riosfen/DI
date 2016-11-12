/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Vistas.Menu;
import Vistas.MenuBarra;
import Vistas.Vista;
import javax.swing.JFrame;

/**
 *
 * @author samo_
 */
public class ProyectoJTextPane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Vista v = new Vista();
        MenuBarra m = new MenuBarra();
        Menu t = new Menu();
        JFrame ventana = new JFrame("Editor de texto");
       
        
        ventana.add(v);
        ventana.add(m);
        ventana.setJMenuBar(t);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(600, 400);
        ventana.setVisible(true);
        
    }
    
}