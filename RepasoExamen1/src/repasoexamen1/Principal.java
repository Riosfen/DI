/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoexamen1;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import repasoexamen1.controlador.Controlador;
import repasoexamen1.modelo.Libro;
import repasoexamen1.vista.BarraNavegacion;
import repasoexamen1.vista.VistaPrincipal;

/**
 *
 * @author alumno2damdiurno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Libro> libros = new ArrayList<Libro>();
        
        JFrame ventana = new JFrame();
        VistaPrincipal vista = new VistaPrincipal(resultadoLogin());
        BarraNavegacion nab = new BarraNavegacion();
        Controlador c = new Controlador(vista);
        
        vista.addControlador(c);
        nab.addControlador(c);
        
        ventana.setJMenuBar(nab);
        ventana.add(vista);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.pack();
        ventana.setResizable(false);
        ventana.setVisible(true);
        
    }

    private static boolean resultadoLogin() {
        
        boolean activo = false;
        
        String resul = JOptionPane.showInputDialog(null, "Usuario", "Identificación", JOptionPane.QUESTION_MESSAGE);
        
        if (resul != null && resul.equals("usuario")){
            activo = true;
        }
        
        return activo;
    }
    
}
