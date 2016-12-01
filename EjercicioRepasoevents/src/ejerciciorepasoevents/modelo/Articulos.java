/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciorepasoevents.modelo;

/**
 *
 * @author samo_
 */
public class Articulos {
    
    private String nombre;
    private String detalles;
    private int precio;
    private boolean stock;
    
    public Articulos(String nombre, String detalles, int precio, boolean stock){
        
        this.nombre = nombre;
        this.detalles = detalles;
        this.precio = precio;
        this.stock = stock;
        
    }

    public String getDetalles() {
        return detalles;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public boolean isStock() {
        return stock;
    }
    
}
