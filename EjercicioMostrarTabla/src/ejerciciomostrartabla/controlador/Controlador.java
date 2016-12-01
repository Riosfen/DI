/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciomostrartabla.controlador;

import ejerciciomostrartabla.modelo.Producto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

/**
 *
 * @author samo_
 */
public class Controlador implements ActionListener{

    private HashMap<String, Producto> vProducto;
    
    public Controlador(HashMap<String, Producto> vProducto){
    
        this.vProducto = vProducto;
    
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    
        switch(e.getActionCommand()){
            case "agregarProducto":
                
            break;
            
            case "VerTabla":
                
            break;
            
            case "salir":
                System.exit(0);
            break;
        }
        
    }
    
}
