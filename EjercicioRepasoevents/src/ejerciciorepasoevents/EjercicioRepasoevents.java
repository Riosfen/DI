/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciorepasoevents;

import ejerciciorepasoevents.controlador.Controlador;
import ejerciciorepasoevents.modelo.Articulos;
import ejerciciorepasoevents.modelo.ModeloTabla;
import ejerciciorepasoevents.vista.Vista;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.JFrame;

/**
 *
 * @author samo_
 */
public class EjercicioRepasoevents {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JFrame ventana = new JFrame("eventos");
        Vista vista = new Vista();
        
        HashMap<String, Articulos> articulos = new HashMap<>();
        ModeloTabla modelo = new ModeloTabla();
        
        cargarContenedorArticulos(articulos);
        insertarFilas(articulos, modelo);
        
        vista.setModeloAtributos(modelo);
        
        Controlador controlador = new Controlador(vista);
        
        vista.addControlador(controlador);
        
        ventana.add(vista);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.pack();
        ventana.setVisible(true);
        
    }

    private static void cargarContenedorArticulos(HashMap<String, Articulos> articulos) {
        
        Articulos a;
        
        a = new Articulos("Teclado", "Desgastado", 25, true);
        articulos.put(a.getNombre(), a);
        a = new Articulos("Raton", "Desgastado", 9, true);
        articulos.put(a.getNombre(), a);
        a = new Articulos("Monitro", "Desgastado", 60, true);
        articulos.put(a.getNombre(), a);
        a = new Articulos("Wifi", "Desgastado", 17, true);
        articulos.put(a.getNombre(), a);
        a = new Articulos("Sillon", "Desgastado", 80, true);
        articulos.put(a.getNombre(), a);
        a = new Articulos("Ordenador", "Desgastado", 500, true);
        articulos.put(a.getNombre(), a);
        
    }

    private static void insertarFilas(HashMap<String, Articulos> articulos, ModeloTabla modelo) {
        
        String[] cabecera = {"Nombre", "Detalles", "Precio", "Stock"};
        
        modelo.setColumnIdentifiers(cabecera);
        
        for (int i = 0; i < 10; i++) {
            
        }
        
        Iterator it = articulos.values().iterator();
        
        for (Iterator iterator = it; iterator.hasNext();) {
            Articulos articulo = (Articulos) iterator.next();
            
            Object[] fila = {articulo.getNombre(), articulo.getDetalles(), articulo.getPrecio(), articulo.isStock()};
            modelo.addRow(fila);
            
        }
        
    }
    
}
