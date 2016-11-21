/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareacoches.modelo;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author samo_
 */
public class Coches {
    
    private Map<String, Coche> vCoches;
    
    public Coches() {
        
        vCoches = new TreeMap<String, Coche>();
        
    }
    
    public boolean addCoche(Coche c){
    
        boolean resultado = vCoches.containsKey(c.getMatricula());
        
        if (!resultado){
            vCoches.put(c.getMatricula(), c);
        }
        
        return resultado;
        
    }
    
}
