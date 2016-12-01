/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciomostrartabla.modelo;

/**
 *
 * @author samo_
 */
public class Producto {
    
    private String nombre;
    private Enum categoria;
    private int precio;
    
    public Producto(String nombre, Enum categoria, int precio){
    
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        
    }

    public Enum getCategoria() {
        return categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }
    
}
