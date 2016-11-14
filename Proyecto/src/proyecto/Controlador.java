/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author samo_
 */
public class Controlador implements ActionListener {

    private Vista v;
    
    public Controlador(Vista v){
    
        this.v = v;
    
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        switch(e.getActionCommand()){
            case "buscar":
                String url = v.getUrl().getText();
                v.cargarPaginaWeb(url);
                break;
            case "negrita":
                v.setNegrita();
            break;
            case "cursiva":
                v.setCursiva();
            break;
            case "subrayar":
                v.setSubrayado();
            break;
            case "editar":
                v.setEditar();
            break;
        }
        
    }
    
    
    
}
