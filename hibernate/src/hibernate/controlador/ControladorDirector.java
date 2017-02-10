/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate.controlador;

import hibernate.vista.VistaPrincipal;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author alumno2damdiurno
 */
public class ControladorDirector implements ActionListener{

    private VistaPrincipal vPrincipal;
    private JFrame ventana;
    private Dimension tamanio;
    
    public ControladorDirector(JFrame ventana,VistaPrincipal vPrincipal){
        this.ventana = ventana;
        this.vPrincipal = vPrincipal;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        switch(e.getActionCommand()){
        
            case "cliente":
                break;
            case "director":
                break;
            case "pelicula":
                break;
            case "atras":
                //tamanio = ventana.getSize();
                ventana.setContentPane(vPrincipal);
                //ventana.setSize(tamanio);
                ventana.pack();
                ventana.repaint();
                break;
            
        }
        
    }
    
}
