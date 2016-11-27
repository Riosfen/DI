/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciorepaso;

import ejerciciorepaso.controlador.Controlador;
import ejerciciorepaso.modelo.Jugador;
import ejerciciorepaso.vista.BarraHerramienta;
import ejerciciorepaso.vista.Vista;
import ejerciciorepaso.vista.BarraMenu;
import java.awt.BorderLayout;
import java.util.HashMap;
import javax.swing.JFrame;

/**
 *
 * @author samo_
 */
public class EjercicioRepaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        HashMap<Integer, Jugador> vJugadores = new HashMap<>();
        
        JFrame ventana = new JFrame("Ejercicio de Repaso");
        Vista vista = new Vista();
        BarraMenu barraMenu = new BarraMenu();
        BarraHerramienta barraHerramienta = new BarraHerramienta();
        Controlador contro = new Controlador(ventana, vJugadores);
        
        vista.addControlador(contro);
        barraHerramienta.addControlador(contro);
        barraMenu.addControlador(contro);
        
        ventana.add(barraHerramienta, BorderLayout.NORTH);
        ventana.setJMenuBar(barraMenu);
        ventana.add(vista);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.pack();
        ventana.setVisible(true);
        
    }
    
}
