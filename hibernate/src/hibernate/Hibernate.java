/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate;

import hibernate.controlador.ControladorCliente;
import hibernate.controlador.ControladorDirector;
import hibernate.controlador.ControladorPelicula;
import hibernate.controlador.ControladorPrincipal;
import hibernate.vista.VistaCliente;
import hibernate.vista.VistaDirector;
import hibernate.vista.VistaPelicula;
import hibernate.vista.VistaPrincipal;
import javax.swing.JFrame;

/**
 *
 * @author alumno2damdiurno
 */
public class Hibernate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JFrame ventana = new JFrame("Videoclub");
        
        VistaPrincipal vPrincipal = new VistaPrincipal();
        VistaCliente vCliente = new VistaCliente();
        VistaDirector vDirector = new VistaDirector();
        VistaPelicula vPelicula = new VistaPelicula();
        
        ControladorPrincipal cPrincipal = new ControladorPrincipal(ventana,vCliente,vDirector,vPelicula);
        ControladorCliente cCliente = new ControladorCliente(ventana,vPrincipal);
        ControladorDirector cDirector = new ControladorDirector(ventana,vPrincipal);
        ControladorPelicula cPelicula = new ControladorPelicula(ventana,vPrincipal);
        
        vPrincipal.addControlador(cPrincipal);
        vCliente.addControlador(cCliente);
        vDirector.addControlador(cDirector);
        vPelicula.addControlador(cPelicula);
        
        ventana.add(vPrincipal);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.pack();
        ventana.setVisible(true);
        
        
    }
    
}
