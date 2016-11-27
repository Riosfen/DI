/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciorepaso.vista;

import ejerciciorepaso.modelo.ModeloTabla;
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
    
        this.modelo = new ModeloTabla();
        this.tabla = new JTable(modelo);
        
        this.setViewportView(tabla);
    
    }

    public void addCabecera(String[] cabecera){
    
        modelo.setColumnIdentifiers(cabecera);
    
    }
    
    public void addFila(Object[] fila){
    
        modelo.addRow(fila);
    
    }
    
}
