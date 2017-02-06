/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotpv.Principal;

import proyectotpv.Modelo.BigPanel;
import javax.swing.JFrame;
import proyectotpv.Controlador.ControladorPrincipal;
import proyectotpv.Vista.VistaPrincipal;

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
        BigPanel barra = new BigPanel(ventana, "Programa de victor", null);
        VistaPrincipal vp = new VistaPrincipal(barra);
        ControladorPrincipal c = new ControladorPrincipal(vp);
        
        
        ventana.setContentPane(vp);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setExtendedState(JFrame.MAXIMIZED_BOTH);
        ventana.setVisible(true);
        ventana.setResizable(false);
        
        barra.setFontSize(ventana.getSize().height*10/100);
        
    }
    
}
