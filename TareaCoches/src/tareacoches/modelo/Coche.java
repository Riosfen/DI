/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareacoches.modelo;

import tareacoches.vistas.Vista;

/**
 *
 * @author samo_
 */
public class Coche {
    
    private String modelo;
    private String color;
    private String matricula;
    private String seguro;
    private String annioMatriculacion;
    private String tipoCoche;
    private boolean metalizado;
    
    public Coche(String modelo, String color, String matricula, String seguro, String annioMatriculacion, String tipoCoche, boolean metalizado){
    
        this.modelo = modelo;
        this.color = color;
        this.matricula = matricula;
        this.seguro = seguro;
        this.annioMatriculacion = annioMatriculacion;
        this.tipoCoche = tipoCoche;
        this.metalizado = metalizado;
    
    }

    public String getMatricula() {
        return this.matricula;
    }
    
}
