/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.awt.event.KeyEvent;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author samo_
 */
public class Menu extends JMenuBar{
    
    private JMenu archivo;
    private JMenuItem salir;
    
    public Menu(){
        // Se crean los menus
        archivo = new JMenu("Archivo");
        
        // Se crean los item
        salir = new JMenuItem("Salir", KeyEvent.VK_S);
        
        // Se introducen los item en los menus si así se desea
        archivo.add(salir);
        
        // Se introducen los menus/items en la vista
        this.add(archivo);
        
    }
    
}
