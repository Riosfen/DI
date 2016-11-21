/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareacoches.controlador;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import tareacoches.modelo.Coche;
import tareacoches.modelo.Coches;
import tareacoches.vistas.BarraHerramientas;
import tareacoches.vistas.BarraMenus;
import tareacoches.vistas.ModeloTabla;
import tareacoches.vistas.Vista;

/**
 *
 * @author samo_
 */
public class Controlador implements ActionListener {

    private JFrame f;
    private Vista v;
    private BarraHerramientas h;
    private BarraMenus b;
    private Coche c;
    private Coches vc;
    
    public Controlador(Vista v, BarraMenus b, BarraHerramientas h, JFrame f, Coches vc){
    
        this.vc = vc;
        this.f = f;
        this.v = v;
        this.b = b;
        this.h = h;
    
    }
    
    private ModeloTabla modeloTabla;
    private JTable tabla;
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        switch(e.getActionCommand()){
            case "buscar":
                modeloTabla = new ModeloTabla();
                tabla = new JTable(modeloTabla);
                String buscar = JOptionPane.showInputDialog(null, "Insertar matricula a buscar");
                
                mostrarTabla(tabla);
                break;
            case "consultar":
                modeloTabla = new ModeloTabla();
                tabla = new JTable(modeloTabla);
                
                mostrarTabla(tabla);
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
            v.getPintura().isSelected());

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
