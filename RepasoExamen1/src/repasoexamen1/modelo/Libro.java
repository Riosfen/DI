/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoexamen1.modelo;

/**
 *
 * @author alumno2damdiurno
 */
public class Libro {
    
    private String titulo;
    private String autor;
    private int anio;
    private String editorial;
    private String datosPrestamo;
    
    public Libro(String titulo){
        this.titulo = titulo;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setDatosPrestamo(String datosPrestamo) {
        this.datosPrestamo = datosPrestamo;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public String getAutor() {
        return autor;
    }

    public String getDatosPrestamo() {
        return datosPrestamo;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getTitulo() {
        return titulo;
    }
    
}
