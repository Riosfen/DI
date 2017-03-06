/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoexamen1.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import repasoexamen1.vista.VistaPrincipal;

/**
 *
 * @author samo_
 */
public class Herramientas {
    
    private VistaPrincipal vista;
    private ArrayList<Libro> libros;
    private JFrame ventana;
    
    public Herramientas(VistaPrincipal vista, ArrayList<Libro> libros, JFrame ventana){
        this.vista = vista;
        this.libros = libros;
        this.ventana = ventana;
        
    }
    
    public void aniadirLibro(){
        Libro l = new Libro(vista.getTitulo());
        l.setAnio(vista.getAnio());
        l.setAutor(vista.getAutor());
        l.setEditorial(vista.getEditorial());
        l.setPrestado(vista.getPrestado());
        
        libros.add(l);
        
    }
    
    public void buscarLibro(){
        String titulo = vista.getTitulo();
        Libro resul = null;
        
        for (Iterator<Libro> iterator = libros.iterator(); iterator.hasNext();) {
            Libro libro = iterator.next();
            
            if (libro.getTitulo().equals(titulo)){
                resul = libro;
            }
            
        }
        
        if (resul != null){
            JDialog datos = new JDialog(ventana, "Datos del libro", true);
                JScrollPane scroll = new JScrollPane();
                JTextArea area = new JTextArea(obtenerDatosLibro(resul));
                
                scroll.setViewportView(area);
                
                datos.add(scroll);
                datos.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                datos.pack();
                datos.setVisible(true);
                
        }
    }

    private String obtenerDatosLibro(Libro libro) {
        StringBuilder resul = new StringBuilder();
        
        resul.append("Título: " + libro.getTitulo() + "\n" +
                "Autor: " + libro.getAutor() + "\n" +
                "Editorial: " + libro.getEditorial() + "\n");
        
        if (libro.isPrestado()){
            resul.append("Prestado");
        }else{
            resul.append("No prestado");
        }
        
        return resul.toString();
    }
    
}
