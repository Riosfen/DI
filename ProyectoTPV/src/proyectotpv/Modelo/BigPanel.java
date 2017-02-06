/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotpv.Modelo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author samo_
 */

public class BigPanel extends JPanel implements Serializable{
    
    public static final String IMG_EQUIS = "src/recursos/salir2.jpeg";
    
    private Color color;
    private final JFrame ventana;
    private String tittle;
    private JLabel contenedorIcono, titulo;
    private JButton btnSalir;
    private Image tratar;
    private ImageIcon icono, imagen;
    private Font fuente = getFont();
    
    //
    // Inicio lista de constructores 
    //
    
    public BigPanel(JFrame ventana, String tittle, Color color){
        this.color = color;
        this.ventana = ventana;
        this.tittle = tittle;
        barraSuperior();
        
    }
    public BigPanel(JFrame ventana, ImageIcon imagen, String tittle, Color color){
        this.color = color;
        this.ventana = ventana;
        this.imagen = imagen;
        this.tittle = tittle;
        barraSuperior();
        
    }
    public BigPanel(JFrame ventana, ImageIcon imagen, String tittle){
        this.imagen = imagen;
        this.tittle = tittle;
        this.ventana = ventana;
        barraSuperior();
        
    }
    
    //
    // Fin lista de constructores 
    //
    
    //
    // Inicio Getters y Setters
    //
    
    public void setTittleColor(Color color){
        
    }
    public void setTittle(String tittle) {
        this.tittle = tittle;
        titulo.setText(tittle);
    }
    public void setIcono(ImageIcon icono) {
        this.icono = icono;
    }
    public void setFuente(Font fuente){
        this.fuente = fuente;
    }
    public void setFontSize(int size){
        fuente = new Font(fuente.getFamily(),fuente.getStyle(),(int)(size/1.5));
        titulo.setFont(fuente);
        btnSalir.setPreferredSize(new Dimension(size, size));
        
        btnSalir.setIcon(redimensionarImagenAlto(icono,size));
        
        contenedorIcono.setIcon(redimensionarImagenAncho(imagen,size));
    }
    public void setBackgroundColorBar(Color color){
        this.setBackground(color);
    }
    
    public JLabel getTitulo(){
        return titulo;
    }
    public String getTittle(){
        return tittle;
    }
    public ImageIcon getLogo(){
        return imagen;
    }
    public Color getColor(){
        return color;
    }
    public 
    
    //
    // Fin Getters y Setters
    //
    
    //
    // Controlador
    public void controlador(ActionListener a, String ActionCommand){
        btnSalir.addActionListener(a);
        btnSalir.setActionCommand(ActionCommand);
    }
    
    private ImageIcon redimensionarImagenAncho(ImageIcon icono, int size){
        try {
            tratar = icono.getImage();
            tratar = tratar.getScaledInstance(-1, size, Image.SCALE_DEFAULT);
            icono = new ImageIcon(tratar);
        } catch (NullPointerException e) {
            System.out.println("Error, no se encuentra la imagen o no se ha especificado ninguna");
        }
        
       return icono;
        
    }
    private ImageIcon redimensionarImagenAlto(ImageIcon icono, int size){
        try {
            tratar = icono.getImage();
            tratar = tratar.getScaledInstance(size, -1, Image.SCALE_SMOOTH);
            icono = new ImageIcon(tratar);
        } catch (NullPointerException e) {
            System.out.println("Error, no se encuentra la imagen o no se ha especificado ninguna");
        }

       return icono;
        
    }
    
    private void barraSuperior() {
        
        this.setLayout(new BorderLayout());
        
        icono = new ImageIcon(IMG_EQUIS);
        
        contenedorIcono = new JLabel(imagen);
        btnSalir = new JButton();
        titulo = new JLabel(tittle);
        
        
        ventana.setUndecorated(true);
        if (color == null){
            this.setBackground(Color.GRAY);
        }else{
            this.setBackground(color);
        }
        
        
        if (icono != null){ 
            this.add(contenedorIcono, BorderLayout.WEST);
            this.add(btnSalir, BorderLayout.EAST);
            
        }else{
            
            this.add(btnSalir, BorderLayout.EAST);
        }
        
        this.add(titulo, BorderLayout.CENTER);
        
    }
    
    
}
