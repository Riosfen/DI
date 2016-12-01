/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciorepasoevents.controlador;

import ejerciciorepasoevents.vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author samo_
 */
public class Controlador implements ActionListener {

    private Vista vista;
    
    public Controlador(Vista vista){
    
        this.vista = vista;
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()){
        
            case "eliminar":
                break;
                
            case "agregar":
                break;
        
        }
    }
    
    

    
    
}
