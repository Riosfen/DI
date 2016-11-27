/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciorepaso.controlador;

import ejerciciorepaso.modelo.Jugador;
import ejerciciorepaso.vista.AniadirJugador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 *
 * @author samo_
 */
public class Controlador implements ActionListener {

    private JFrame ventana;
    private HashMap<Integer, Jugador> vJugadores;
    
    public Controlador(JFrame ventana, HashMap<Integer, Jugador> vJugadores){
    
        this.vJugadores = vJugadores;
        this.ventana = ventana;
    
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    
        switch(e.getActionCommand()){
            case "aniadirJugador":
                
                tratarAniadirJugador();
                
                break;
            case "aniadirEspecialidad":
                break;
            case "verEspecialidad":
                break;
            case "verCalendario":
                break;
        }
    
    }

    private void tratarAniadirJugador() {
   
        AniadirJugador vista = new AniadirJugador();
        JDialog ventanaAniadirJugador = new JDialog(ventana, "Añadir un jugador");
        ControladorJugadores controladorJ = new ControladorJugadores(vista);
        
        vista.addControlador(controladorJ);
                
        ventanaAniadirJugador.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
        ventanaAniadirJugador.add(vista);
        ventanaAniadirJugador.pack();
        ventanaAniadirJugador.setVisible(true);
        ventanaAniadirJugador.setModal(true);
        
    }
    
}
