/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciorepaso.modelo;

/**
 *
 * @author samo_
 */
public class Jugador {
    
    private int dorsal;
    private String nombre;
    private double altura;
    private String posicion;
    private boolean suplente;
    
    public Jugador(int dorsal, String nombre, double altura, String posicion, boolean suplente){
        
        this.altura = altura;
        this.dorsal = dorsal;
        this.nombre = nombre;
        this.posicion = posicion;
        this.suplente = suplente;
        
    }

    public double getAltura() {
        return altura;
    }

    public int getDorsal() {
        return dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public boolean isSuplente() {
        return suplente;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setSuplente(boolean suplente) {
        this.suplente = suplente;
    }
    
}
