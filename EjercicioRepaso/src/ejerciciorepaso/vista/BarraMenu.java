/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciorepaso.vista;

import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

/**
 *
 * @author samo_
 */
public class BarraMenu extends JMenuBar {

    private JMenu sistema, operaciones;
    private JMenuItem salir, crearJugador,crearEstadistica, verEstadistica, verCalendario;
    
    public BarraMenu(){
        
        sistema = new JMenu("Sistema");
        operaciones = new JMenu("Operaciones");
        
        salir = new JMenuItem("Salir");
        salir.setMnemonic('S');
        crearJugador = new JMenuItem("Crear Jugador");
        crearJugador.setMnemonic('N');
        crearEstadistica = new JMenuItem("Crear Estadistica Jugador");
        crearEstadistica.setMnemonic('E');
        verEstadistica = new JMenuItem("Ver Estadisticas Jugador");
        verEstadistica.setMnemonic('j');
        verCalendario = new JMenuItem("Ver Calendario");
        verCalendario.setMnemonic('C');
        
        sistema.add(salir);
        operaciones.add(crearJugador);
        operaciones.add(crearEstadistica);
        operaciones.add(new JSeparator());
        operaciones.add(verEstadistica);
        operaciones.add(verCalendario);
        
        this.add(sistema);
        this.add(operaciones);
        
    }
    
    public void addControlador (ActionListener e){
        
        salir.addActionListener(e);
        crearJugador.addActionListener(e);
        crearEstadistica.addActionListener(e);
        verEstadistica.addActionListener(e);
        verCalendario.addActionListener(e);
        
        salir.setActionCommand("salir");
        crearJugador.setActionCommand("aniadirJugador");
        crearEstadistica.setActionCommand("aniadirEspecialidad");
        verEstadistica.setActionCommand("verEspecialidad");
        verCalendario.setActionCommand("verCalendario");
        
    }
    
}
