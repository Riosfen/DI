/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

/**
 *
 * @author samo_
 */
public class Menu extends JMenuBar{
    
    private JMenu archivo, herramienta, texto, insertar;
    private JMenuItem nuevo, abrir, guardar, salir, negrita, cursiva, color, 
                    centro, izquierda, derecha, tabulacion, subrallado, fondo, icono;
    
    public Menu(){
        // Se crean los menus
       archivo = new JMenu("Archivo");
        herramienta = new JMenu("Herramientas");
        texto = new JMenu("Texto");
        insertar = new JMenu("Insertar");
        
        // Se crean los item
        archivo.setMnemonic('A');
        herramienta.setMnemonic('H');
        texto.setMnemonic('T');
        insertar.setMnemonic('I');
        
        nuevo = new JMenuItem("Nuevo", 'N');
        nuevo.setAccelerator(KeyStroke.getKeyStroke('N', InputEvent.CTRL_DOWN_MASK));
        abrir = new JMenuItem("Abrir", 'A');
        abrir.setAccelerator(KeyStroke.getKeyStroke('O', InputEvent.CTRL_DOWN_MASK));
        guardar = new JMenuItem("Guardar", 'G');
        guardar.setAccelerator(KeyStroke.getKeyStroke('S', InputEvent.CTRL_DOWN_MASK));
        salir = new JMenuItem("Salir", 'S');
        negrita = new JMenuItem("Negrita", 'N');
        negrita.setAccelerator(KeyStroke.getKeyStroke('B', InputEvent.CTRL_DOWN_MASK));
        subrallado = new JMenuItem("Subrrallado", 'S');
        subrallado.setAccelerator(KeyStroke.getKeyStroke('U', InputEvent.CTRL_DOWN_MASK));
        cursiva = new JMenuItem("Cursiva", 'K');
        cursiva.setAccelerator(KeyStroke.getKeyStroke('K', InputEvent.CTRL_DOWN_MASK));
        color = new JMenuItem("Color", 'C');
        centro = new JMenuItem("Centro", 'C');
        izquierda = new JMenuItem("Izquierda", 'I');
        derecha = new JMenuItem("Derecha", 'D');
        tabulacion = new JMenuItem("Tab", 'T');
        fondo = new JMenuItem("Fondo", 'F');
        icono = new JMenuItem("Icono", 'I');
        
        // Se introducen los item en los menus si así se desea
        
        archivo.add(nuevo);
        archivo.add(abrir);
        archivo.add(guardar);
        archivo.add(salir);
        
        insertar.add(icono);
        insertar.add(fondo);
        
        texto.add(negrita);
        texto.add(subrallado);
        texto.add(cursiva);
        texto.add(color);
        texto.add(centro);
        texto.add(izquierda);
        texto.add(derecha);
        texto.add(tabulacion);
        texto.add(subrallado);
        
        herramienta.add(texto);
        herramienta.add(insertar);
        
        // Se introducen los menus/items en la vista
        add(archivo);
        add(herramienta);
        
    }
    
}
