/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciomostrartabla.modelo;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author samo_
 */
public class ModeloTabla extends DefaultTableModel {
    
    private Class[] atributos = {String.class, Integer.class, Enum.class};

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return atributos[columnIndex];
    }

    
    
}
