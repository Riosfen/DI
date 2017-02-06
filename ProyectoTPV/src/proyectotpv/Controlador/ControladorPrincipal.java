/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotpv.Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import proyectotpv.Vista.VistaPrincipal;

/**
 *
 * @author samo_
 */
public class ControladorPrincipal implements ActionListener{
    
    private VistaPrincipal vista;
    
    public ControladorPrincipal(VistaPrincipal vista){
        this.vista = vista;
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        switch(e.getActionCommand()){
            case "salir":
                System.exit(0);
                break;
        }
        
    }
    
    
    
}
