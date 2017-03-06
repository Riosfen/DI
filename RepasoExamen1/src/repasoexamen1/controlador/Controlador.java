/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoexamen1.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import repasoexamen1.vista.VistaPrincipal;

/**
 *
 * @author alumno2damdiurno
 */
public class Controlador implements ActionListener{
    
    private VistaPrincipal vista;
    
    public Controlador(VistaPrincipal vista){
        this.vista = vista;
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()){
            case "salir":
                break;
            case "aniadir":
                
                break;
            case "buscar":
                break;
        }
    }
    
}
