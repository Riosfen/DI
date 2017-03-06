/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoexamen1.vista;

import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu.Separator;

/**
 *
 * @author alumno2damdiurno
 */
public class BarraNavegacion extends JMenuBar {
    
    private JMenu archivo, operaciones;
    private JMenuItem salir, aniadir, buscar;
    
    public BarraNavegacion(){
        
        archivo = new JMenu("Archivo");
        operaciones = new JMenu("Operaciones");
        
        archivo.setMnemonic('A');
        operaciones.setMnemonic('O');
        
        
        salir = new JMenuItem("Salir");
        aniadir = new JMenuItem("Añadir libro");
        buscar = new JMenuItem("Buscar libro");
        
        salir.setMnemonic('S');
        aniadir.setMnemonic('A');
        buscar.setMnemonic('B');
        
        archivo.add(salir);
        
        operaciones.add(aniadir);
        operaciones.add(new Separator());
        operaciones.add(buscar);
        
        this.add(archivo);
        this.add(operaciones);
        
    }
    
    public void addControlador(ActionListener e){
    
        salir.addActionListener(e);
        aniadir.addActionListener(e);
        buscar.addActionListener(e);
        
        salir.setActionCommand("salir");
        aniadir.setActionCommand("aniadir");
        buscar.setActionCommand("buscar");
        
    }
    
}
