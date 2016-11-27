/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciorepaso.controlador;

import ejerciciorepaso.vista.AniadirJugador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author samo_
 */
public class ControladorJugadores implements ActionListener {

    private AniadirJugador vistaJugador;
    
    public ControladorJugadores(AniadirJugador vistaJugador){
    
        this.vistaJugador = vistaJugador;
        
    }
    
    public void actionPerformed(ActionEvent e) {
    
        switch(e.getActionCommand()){
        
            case "cancelar":
                
                vistaJugador.resetearVista();
                
                break;
            case "aniadir":
                break;
        }
        
    }
    
}
