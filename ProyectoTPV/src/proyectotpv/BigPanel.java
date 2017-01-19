/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotpv;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author samo_
 */

enum DecoreText {UNDECORED,NEGRITA,CURSIVA,NEGRITA_CURSIVA};

public class BigPanel extends JPanel{
    
    public ImageIcon IMG_EQUIS = new ImageIcon("ruta imagen"); // imagenes por defecto
    
    private Color color;
    private JPanel barraSuperior;
    private JFrame ventana;
    private String tittle;
    private Image icono;
    private Image imageAction;
    private Font fuente;
    
    public BigPanel(JFrame ventana, Color color){
        this.ventana = ventana;
        barraSuperior();
        
    }
    public BigPanel(JFrame ventana, String tittle, Color color){
        this.ventana = ventana;
        this.tittle = tittle;
        barraSuperior();
        
    }
    public BigPanel(JFrame ventana, Image icono, String tittle, Color color){
        this.ventana = ventana;
        this.icono = icono;
        this.tittle = tittle;
        barraSuperior();
        
    }
    public BigPanel(JFrame ventana, String tittle, Image imageAction, Color color){
        this.ventana = ventana;
        this.tittle = tittle;
        this.imageAction = imageAction;
        barraSuperior();
        
    }
    public BigPanel(JFrame ventana,Image icono, String tittle, Image imageAction, Color color){
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

    private void setFuente(String nombreFuente, int DecoreText, int tamanio){
        fuente = new Font(nombreFuente,DecoreText,tamanio);
    }
    
    private void setfontSize(){
        fuente = new Font(fuente.getFamily(),fuente.getStyle(),fuente.getSize());
    }
    
    public void setBackgroundColorBar(){}
    
    private void barraSuperior() {
        
        barraSuperior = new JPanel();
        
        ventana.add(barraSuperior);
        
    }
    
    
}
