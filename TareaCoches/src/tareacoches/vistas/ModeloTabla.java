/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareacoches.vistas;

import javax.swing.JRadioButton;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author samo_
 */
public class ModeloTabla extends DefaultTableModel{

    private Class[] atributo = {String.class,String.class,String.class,String.class,Integer.class,Vista.Tipos.class,Boolean.class};
    
    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
    
        this.getColumnClass(columnIndex);
        
        return atributo[columnIndex];
    
    }

    
    
}
