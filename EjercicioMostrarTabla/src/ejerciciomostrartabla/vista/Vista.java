/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciomostrartabla.vista;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author samo_
 */
public class Vista extends JPanel {
    
    private JButton btn_verTabla, btn_agregarProducto, btn_salir;

    public Vista(){
        
        this.setLayout(new FlowLayout());
        
        btn_agregarProducto = new JButton("Agregar Producto");
        btn_salir = new JButton("Salir");
        btn_verTabla =  new JButton("Ver Tabla");
        
        this.add(btn_agregarProducto);
        this.add(btn_verTabla);
        this.add(btn_salir);
        
    }
    
    public void addControlador(ActionListener e){

        btn_agregarProducto.addActionListener(e);
        btn_verTabla.addActionListener(e);
        btn_salir.addActionListener(e);
    
        btn_agregarProducto.setActionCommand("agregarProducto");
        btn_verTabla.setActionCommand("verTabla");
        btn_salir.setActionCommand("salir");

    }
    
}
