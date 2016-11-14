/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;

/**
 *
 * @author samo_
 */
public class MenuBarra extends JToolBar{
    
    private JButton nuevo, abrir, guardar, color, 
                    centro, izquierda, derecha, fondo, icono;
    
    private JToggleButton negrita, cursiva, subrayado;
    
    private ImageIcon ico_nuevo, ico_abrir, ico_guardar, ico_negrita,
                    ico_cursiva, ico_color, ico_centro, ico_izquierda, ico_derecha,
                    ico_subrayado, ico_fondo, ico_icono;
    
    public MenuBarra(){
         super();
         
        // nombre cuando no esta aderido a la ventana
        setName("Herramientas");
        // hace que no se pueda separar de la ventana
        setFloatable(false);
        // no aparece el icono para mover la barra de herramientas pero si se puede mover
        // setBorderPainted(false);
        
        ico_nuevo = new ImageIcon();
        ico_abrir = new ImageIcon();
        ico_guardar = new ImageIcon();
        ico_negrita = new ImageIcon();
        ico_cursiva = new ImageIcon();
        ico_color = new ImageIcon();
        ico_centro = new ImageIcon();
        ico_izquierda = new ImageIcon();
        ico_derecha = new ImageIcon();
        ico_subrayado = new ImageIcon();
        ico_fondo = new ImageIcon();
        ico_icono = new ImageIcon();
        
        nuevo = new JButton(ico_nuevo);
        nuevo.setToolTipText("Nuevo Documento 'CTRL + N'");
        abrir = new JButton(ico_abrir);
        abrir.setToolTipText("Abrir 'CTRL + O'");
        guardar = new JButton(ico_guardar);
        guardar.setToolTipText("Guardar 'CTRL + S'");
        negrita = new JToggleButton(ico_negrita);
        negrita.setToolTipText("Negrita 'CTRL + B'");
        cursiva = new JToggleButton(ico_cursiva);
        cursiva.setToolTipText("Cursiva 'CTRL + K'");
        color = new JButton(ico_color);
        color.setToolTipText("Color texto");
        izquierda = new JButton(ico_izquierda);
        izquierda.setToolTipText("Alinear Izquierda");
        centro = new JButton(ico_centro);
        centro.setToolTipText("Alinear centro");
        derecha = new JButton(ico_derecha);
        derecha.setToolTipText("Alinear derecha");
        subrayado = new JToggleButton(ico_subrayado);
        subrayado.setToolTipText("Subrayar 'CTRL + U'");
        fondo = new JButton(ico_fondo);
        fondo.setToolTipText("Color Fondo");
        icono = new JButton(ico_icono);
        icono.setToolTipText("Insertar Icono");
        
        add(nuevo);
        add(abrir);
        add(guardar);
        addSeparator();
        add(negrita);
        add(subrayado);
        add(cursiva);
        add(color);
        add(fondo);
        addSeparator();
        add(izquierda);
        add(centro);
        add(derecha);
        addSeparator();
        add(icono);
        
    }
    
}
