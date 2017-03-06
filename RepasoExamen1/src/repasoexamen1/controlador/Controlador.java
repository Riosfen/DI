/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoexamen1.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import repasoexamen1.modelo.Herramientas;

/**
 *
 * @author alumno2damdiurno
 */
public class Controlador implements ActionListener{
    
    private Herramientas herramientas;
    
    public Controlador(Herramientas herramientas){
        this.herramientas = herramientas;
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()){
            case "salir":
                System.exit(0);
                break;
            case "aniadir":
                herramientas.aniadirLibro();
                break;
            case "buscar":
                herramientas.buscarLibro();
                break;
        }
    }
    
}
