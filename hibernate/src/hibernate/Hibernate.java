/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate;

import javax.swing.JFrame;

/**
 *
 * @author alumno2damdiurno
 */
public class Hibernate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JFrame ventana = new JFrame("Videoclub");
        ControladorPrincipal cp = new ControladorPrincipal();
        VistaPrincipal vp = new VistaPrincipal(cp);
        
        
    }
    
}
