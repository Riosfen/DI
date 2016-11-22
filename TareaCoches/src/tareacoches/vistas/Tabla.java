/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareacoches.vistas;

import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author samo_
 */
public class Tabla extends JScrollPane {
    
    private ModeloTabla modelo;
    private JTable tabla;
    
    public Tabla(){
    
        modelo = new ModeloTabla();
        tabla = new JTable(modelo);
        
        this.setViewportView(tabla);
    
    }
    
    public void anniadirCabecera(String[] nombreCabecera){
    
        modelo.setColumnIdentifiers(nombreCabecera);
    
    }
    
    public void anniadirFila(Object[] nombreFila){
    
        modelo.addRow(nombreFila);
    
    }
    
}
