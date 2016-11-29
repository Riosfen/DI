/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareacoches.vistas;

import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.KeyStroke;

/**
 *
 * @author riosfen
 */
public class BarraMenus extends JMenuBar {
    
    private JMenu operaciones, sistema;
    private JMenuItem buscar, consultar, anniadir, salir;
    
    public BarraMenus() {
    
        operaciones = new JMenu("Operaciones");
        operaciones.setMnemonic('o');
        sistema = new JMenu("Sistema");
        sistema.setMnemonic('s');
    
        buscar = new JMenuItem("Buscar Coche");
        buscar.setMnemonic('b');
        buscar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,InputEvent.CTRL_MASK));
        consultar = new JMenuItem("Consultar Coche");
        consultar.setMnemonic('c');
        consultar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_MASK));
        anniadir = new JMenuItem("Añadir Coche");
        anniadir.setMnemonic('a');
        anniadir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_MASK));
        salir = new JMenuItem("Salir");
        salir.setMnemonic('s');
        salir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
        
        operaciones.add(buscar);
        operaciones.add(consultar);
        operaciones.add(new JSeparator());
        operaciones.add(anniadir);
        
        sistema.add(salir);
        
        this.add(operaciones);
        this.add(sistema);
        
    }
    
    public void addControlador (ActionListener e){
        
        buscar.addActionListener(e);
        consultar.addActionListener(e);
        anniadir.addActionListener(e);
        salir.addActionListener(e);
        
        buscar.setActionCommand("buscar");
        consultar.setActionCommand("consultar");
        anniadir.setActionCommand("anniadir");
        salir.setActionCommand("salir");
        
    }
    
}
