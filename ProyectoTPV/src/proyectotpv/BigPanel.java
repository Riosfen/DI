/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotpv;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author samo_
 */
public class BigPanel extends JPanel{
    
    public ImageIcon IMG_EQUIS = new ImageIcon("ruta imagen"); // imagenes por defecto
    
    private JPanel barraSuperior;
    private JFrame ventana;
    private String tittle;
    private Image icono;
    private Image imageAction;
    
    public BigPanel(JFrame ventana){
        this.ventana = ventana;
        barraSuperior();
        
    }
    public BigPanel(JFrame ventana, String tittle){
        this.ventana = ventana;
        this.tittle = tittle;
        barraSuperior();
        
    }
    public BigPanel(JFrame ventana, Image icono, String tittle){
        this.ventana = ventana;
        this.icono = icono;
        this.tittle = tittle;
        barraSuperior();
        
    }
    public BigPanel(JFrame ventana, String tittle, Image imageAction){
        this.ventana = ventana;
        this.tittle = tittle;
        this.imageAction = imageAction;
        barraSuperior();
        
    }
    public BigPanel(JFrame ventana,Image icono, String tittle, Image imageAction){
        this.ventana = ventana;
        this.icono = icono;
        this.tittle = tittle;
        this.imageAction = imageAction;
        barraSuperior();
        
    }

    public void setOcultarBarraTitulo(JFrame ventana){
        ventana.setUndecorated(true);
    }
    
    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public void setIcono(Image icono) {
        this.icono = icono;
    }

    public void setImageAction(Image imageAction) {
        this.imageAction = imageAction;
    }

    private void setFuente(){}
    
    private void setfontSize(){}
    
    public void setBackgroundColorBar(){}
    
    private void barraSuperior() {
        
        barraSuperior = new JPanel();
        
        ventana.add(barraSuperior);
        
    }
    
    
}
