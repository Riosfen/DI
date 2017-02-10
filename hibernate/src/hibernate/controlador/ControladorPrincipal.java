/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate.controlador;

import hibernate.vista.VistaCliente;
import hibernate.vista.VistaDirector;
import hibernate.vista.VistaPelicula;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author alumno2damdiurno
 */
public class ControladorPrincipal implements ActionListener{

    private VistaCliente vCliente;
    private VistaDirector vDirector;
    private VistaPelicula vPelicula;
    private JFrame ventana;
    private Dimension tamanio;
    
    public ControladorPrincipal(JFrame ventana, VistaCliente vCliente, VistaDirector vDirector, VistaPelicula vPelicula){
        this.ventana = ventana;
        this.vCliente = vCliente;
        this.vDirector = vDirector;
        this.vPelicula = vPelicula;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        switch(e.getActionCommand()){
        
            case "cliente":
                //tamanio = ventana.getSize();
                ventana.setContentPane(vCliente);
                //ventana.setSize(tamanio);
                ventana.pack();
                ventana.repaint();
                break;
            case "director":
                //tamanio = ventana.getSize();
                ventana.setContentPane(vDirector);
                //ventana.setSize(tamanio);
                ventana.pack();
                ventana.repaint();
                break;
            case "pelicula":
                //tamanio = ventana.getSize();
                ventana.setContentPane(vPelicula);
                //ventana.setSize(tamanio);
                ventana.pack();
                ventana.repaint();
                break;
            case "salir":
                System.exit(0);
                break;
            
        }
        
    }
}
