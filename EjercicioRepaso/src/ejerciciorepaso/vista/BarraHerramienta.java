/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciorepaso.vista;

import java.awt.Image;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JToolBar;

/**
 *
 * @author samo_
 */
public class BarraHerramienta extends JToolBar {
    
    private JButton btn_aniadirJugador, btn_aniadirEspecialidad, btn_verEspecialidad, btn_verCalendario;
    private Image img_aniadirJugador, img_aniadirEspecialidad, img_verEspecialidad, img_verCalendario;
    
    public BarraHerramienta(){
    
        this.setFloatable(false);
        
        btn_aniadirJugador = new JButton("J");
        btn_aniadirEspecialidad = new JButton("E");
        btn_verEspecialidad = new JButton("V");
        btn_verCalendario = new JButton("C");
        
        this.add(btn_aniadirJugador);
        this.add(btn_aniadirEspecialidad);
        this.add(new Separator());
        this.add(btn_verEspecialidad);
        this.add(btn_verCalendario);
    
    }
    
    public void addControlador(ActionListener e){
        
        btn_aniadirEspecialidad.addActionListener(e);
        btn_aniadirJugador.addActionListener(e);
        btn_verEspecialidad.addActionListener(e);
        btn_verCalendario.addActionListener(e);
        
        btn_aniadirEspecialidad.setActionCommand("aniadirEspecialidad");
        btn_aniadirJugador.setActionCommand("aniadirJugador");
        btn_verEspecialidad.setActionCommand("verEspecialidad");
        btn_verCalendario.setActionCommand("verCalendario");
        
    }
    
}
