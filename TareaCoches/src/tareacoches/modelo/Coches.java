/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareacoches.modelo;

import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author samo_
 */
public class Coches {
    
    private HashMap<String, Coche> vCoches;
    
    public Coches() {
        
        vCoches = new HashMap<String, Coche>();
        
    }
    
    public boolean addCoche(Coche c) {
    
        boolean resultado = false;
        resultado = vCoches.containsKey(c.getMatricula());
        
        if (resultado == false){
            vCoches.put(c.getMatricula(), c);
        }
        
        return resultado;
        
    }
    
    public boolean buscarCoche(String matricula){
    
        return vCoches.containsKey(matricula);
    
    }
    
    public Iterator getIterator(){return vCoches.values().iterator();}
    
    public Object[] getCoche(String matricula){
        
        Coche coche = vCoches.get(matricula);
        
        Object[] datos = {
            coche.getModelo(),
            coche.getColor(),
            coche.getMatricula(),
            coche.getSeguro(),
            coche.getAnnioMatriculacion(),
            coche.getTipoCoche(),
            coche.isMetalizado()
        };
        
        return datos;
    
    }
    
    public int numCoche(){
    
        return vCoches.size();
        
    }
    
}
