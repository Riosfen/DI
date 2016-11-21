/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareacoches.controlador;

import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JFrame;
import tareacoches.modelo.Coche;
import tareacoches.modelo.Coches;
import tareacoches.vistas.BarraHerramientas;
import tareacoches.vistas.BarraMenus;
import tareacoches.vistas.Vista;

/**
 *
 * @author samo_
 */
public class Controlador implements ActionListener {

    private JFrame f;
    private Vista v;
    private BarraHerramientas h;
    private BarraMenus b;
    private Coche c;
    private Coches vc;
    
    public Controlador(Vista v, BarraMenus b, BarraHerramientas h, JFrame f){
    
        this.f = f;
        this.v = v;
        this.b = b;
        this.h = h;
    
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        switch(e.getActionCommand()){
            case "buscar":
                
                break;
            case "consultar":
                break;
            case "anniadir":
                try{
                    c = new Coche(v.getModelo().getText(), v.getColor().getText(), 
                            v.getMatricula().getText(), v.getSeguro().getText(), 
                            Integer.parseInt(v.getFabricacion().getText()), 
                            v.getTipos(), v.getPintura().isSelected());

                    if (vc.addCoche(c)){
                        JDialog error = new JDialog();
                        error.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                        error.setVisible(true);
                    //TODO hacer que aparezca un mensaje de que NO se ha insertado el coche adecuada mente
                    }else{
                    //TODO hacer que aparezca un mensaje de que se ha insertado el coche adecuada mente
                        JDialog correcto = new JDialog();
                        correcto.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                        correcto.setVisible(true);
                    }
                    
                } catch (Exception i){
                    //TODO hacer que aparezca mensaje de error si pasa algo raro
                }
                    
                break;
            case "salir":
                System.exit(0);
                break;
            case "cancelar":
                v.reiniciar();
                break;
        }
        
    }
    
}
