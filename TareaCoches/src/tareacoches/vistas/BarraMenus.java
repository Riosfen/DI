/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareacoches.vistas;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

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
        consultar = new JMenuItem("Consultar Coche");
        consultar.setMnemonic('c');
        anniadir = new JMenuItem("Añadir Coche");
        anniadir.setMnemonic('a');
        salir = new JMenuItem("Salir");
        salir.setMnemonic('s');
        
        operaciones.add(buscar);
        operaciones.add(consultar);
        operaciones.add(new JPopupMenu.Separator());
        operaciones.add(anniadir);
        
        sistema.add(salir);
        
        this.add(operaciones);
        this.add(sistema);
        
    }
    
}
