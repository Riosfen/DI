/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;

/**
 *
 * @author samo_
 */
public class MenuBarra extends JToolBar{
    
    private JButton btn_salir;
    private ImageIcon img_salir;
    
    public MenuBarra(){
        // nombre cuando no esta aderido a la ventana
        setName("Herramientas");
        // hace que no se pueda separar de la ventana
        setFloatable(false);
        // no aparece el icono para mover la barra de herramientas pero si se puede mover
        // setBorderPainted(false);
        
        btn_salir = new JButton(img_salir);
        
        add(btn_salir);
        
    }
    
}
