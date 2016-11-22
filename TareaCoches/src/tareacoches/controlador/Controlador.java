/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareacoches.controlador;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import tareacoches.modelo.Coche;
import tareacoches.modelo.Coches;
import tareacoches.vistas.ModeloTabla;
import tareacoches.vistas.Tabla;
import tareacoches.vistas.Vista;

/**
 *
 * @author samo_
 */
public class Controlador implements ActionListener {

    private JFrame f;
    private Vista v;
    private Coche c;
    private Coches vc;
    
    public Controlador(Vista v, JFrame f, Coches vc){
    
        this.vc = vc;
        this.f = f;
        this.v = v;
    
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        switch(e.getActionCommand()){
            case "buscar":
                String buscar = JOptionPane.showInputDialog(null, "Insertar matricula a buscar");
                
                if(vc.buscarCoche(buscar)){
                    JOptionPane.showMessageDialog(f, "El coche está en la lista");
                }else{}
                    JOptionPane.showMessageDialog(f, "El coche no se encuentra en la lista");
                break;
            case "consultar":
                JDialog vistaTabla = new JDialog(f, "Datos de coches encontrados");
                
                Tabla tabla = new Tabla();
                
                String[] cabecera = {
                    "Modelo",
                    "Color",
                    "Matrícula",
                    "Tipo seguro",
                    "Año de fabricación",
                    "Tipo de vehículo",
                    "Tipo de pintura"
                };
                Object[] coche;
                
                tabla.anniadirCabecera(cabecera);
                
                Iterator iterator = vc.getIterator();
                
                while (iterator.hasNext()) {
                    Coche c = (Coche) iterator.next();
                    
                    tabla.anniadirFila(vc.getCoche(c.getMatricula()));
                }
                
                vistaTabla.setModal(true);
                vistaTabla.setContentPane(tabla);
                vistaTabla.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
                vistaTabla.pack();
                vistaTabla.setVisible(true);
                
                break;
            case "anniadir":
                anniadirCoche();
                break;
            case "salir":
                System.exit(0);
                break;
            case "cancelar":
                v.reiniciar();
                break;
        }
        
    }

    private void anniadirCoche() {
        
        try{
            c = new Coche(v.getModelo(), v.getColor(), 
            v.getMatricula(), v.getSeguro(), 
            v.getFabricacion(), v.getTipos(), 
            v.getPintura());

            if (v.getMatricula().equals("")){
            
                JOptionPane.showMessageDialog(f, "Tienes que rellenar los datos");
            
            }else{
                
                if (vc.addCoche(c)){
                    JOptionPane.showMessageDialog(f, "Error, el coche ya existe");
                }else{
                    JOptionPane.showMessageDialog(f, "Coche insertado correctamente");
                }
                
            }

        } catch (Exception i){
            i.printStackTrace();
                JOptionPane.showMessageDialog(f, "Error inesperado, contacta con el administrador");
        }
    
    }

    private void mostrarTabla(JTable tabla) {
    
        JScrollPane contenedorTable = new JScrollPane(tabla);
        JDialog ventanaTabla = new JDialog(f, "Tabla Consulta");
        ventanaTabla.setModal(true);
        ventanaTabla.setVisible(true);
        ventanaTabla.add(contenedorTable, BorderLayout.CENTER);
        ventanaTabla.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    
    }
    
}
