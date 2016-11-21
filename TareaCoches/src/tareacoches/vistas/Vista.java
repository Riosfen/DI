/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareacoches.vistas;

import java.awt.event.ActionListener;
import java.util.Enumeration;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author samo_
 */
public class Vista extends javax.swing.JPanel {

    public enum Tipos{MINI, UTILITARIO, FAMILIAR, DEPORTIVO};
    /**
     * Creates new form Vista
     */
    public Vista() {
        initComponents();
    }
    
    public JRadioButton getSelection(ButtonGroup group) {
        for (Enumeration e=group.getElements(); e.hasMoreElements(); )
        {
            JRadioButton b = (JRadioButton)e.nextElement();
            if (b.getModel() == group.getSelection())
            {
                return b;
            }
        }

        return null;
    }
    
    public JTextField getMatricula(){return jTextField_matricula;}
    public JTextField getColor(){return jTextField_color;}
    public JTextField getModelo(){return jTextField_modelo;}
    public JFormattedTextField getFabricacion(){return jFormattedTextField_fabricacion;}
    public Tipos getTipos(){return (Tipos) jComboBox1.getSelectedItem();}
    public JRadioButton getSeguro(){return getSelection(buttonGroup_asegurar);}
    public JCheckBox getPintura(){return jCheckBox_metalizado;}
    
    public void addControlador(ActionListener e){
    
        jButton_aceptar.addActionListener(e);
        jButton_cancelar.addActionListener(e);
        
        jButton_aceptar.setActionCommand("anniadir");
        jButton_cancelar.setActionCommand("cancelar");
        
    }
    
    public void reiniciar() {
    
        jTextField_color.setText("");
        jTextField_matricula.setText("");
        jTextField_modelo.setText("");
        jTextField_modelo.requestFocus();
        jFormattedTextField_fabricacion.setText("");
        jCheckBox_metalizado.setSelected(false);
        jComboBox1.setSelectedIndex(0);
        buttonGroup_asegurar.clearSelection();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup_asegurar = new javax.swing.ButtonGroup();
        jLabel_modelo = new javax.swing.JLabel();
        jTextField_modelo = new javax.swing.JTextField();
        jLabel_color = new javax.swing.JLabel();
        jTextField_color = new javax.swing.JTextField();
        jLabel_matrucula = new javax.swing.JLabel();
        jTextField_matricula = new javax.swing.JTextField();
        jRadioButton_todoRiesgo = new javax.swing.JRadioButton();
        jRadioButton_terceros = new javax.swing.JRadioButton();
        jLabel_fabricacion = new javax.swing.JLabel();
        jFormattedTextField_fabricacion = new javax.swing.JFormattedTextField();
        jLabel_tipo = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel_pintura = new javax.swing.JLabel();
        jCheckBox_metalizado = new javax.swing.JCheckBox();
        jButton_aceptar = new javax.swing.JButton();
        jButton_cancelar = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del coche"));
        setLayout(new java.awt.GridLayout(8, 2));

        jLabel_modelo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_modelo.setText("Modelo");
        add(jLabel_modelo);
        add(jTextField_modelo);

        jLabel_color.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_color.setText("Color");
        add(jLabel_color);
        add(jTextField_color);

        jLabel_matrucula.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_matrucula.setText("Matrícula");
        add(jLabel_matrucula);
        add(jTextField_matricula);

        buttonGroup_asegurar.add(jRadioButton_todoRiesgo);
        jRadioButton_todoRiesgo.setMnemonic('t');
        jRadioButton_todoRiesgo.setText("A todo riesgo");
        add(jRadioButton_todoRiesgo);

        buttonGroup_asegurar.add(jRadioButton_terceros);
        jRadioButton_terceros.setMnemonic('t');
        jRadioButton_terceros.setText("A terceros");
        add(jRadioButton_terceros);

        jLabel_fabricacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_fabricacion.setText("Año de fabricación");
        add(jLabel_fabricacion);

        try {
            jFormattedTextField_fabricacion.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        add(jFormattedTextField_fabricacion);

        jLabel_tipo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_tipo.setText("Tipo de coche");
        add(jLabel_tipo);

        jComboBox1.setModel(new DefaultComboBoxModel(Tipos.values()));
        add(jComboBox1);

        jLabel_pintura.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_pintura.setText("Tipo de pintura");
        add(jLabel_pintura);

        jCheckBox_metalizado.setText("Metalizado");
        add(jCheckBox_metalizado);

        jButton_aceptar.setText("Aceptar");
        add(jButton_aceptar);

        jButton_cancelar.setText("Cancelar");
        add(jButton_cancelar);
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup_asegurar;
    private javax.swing.JButton jButton_aceptar;
    private javax.swing.JButton jButton_cancelar;
    private javax.swing.JCheckBox jCheckBox_metalizado;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JFormattedTextField jFormattedTextField_fabricacion;
    private javax.swing.JLabel jLabel_color;
    private javax.swing.JLabel jLabel_fabricacion;
    private javax.swing.JLabel jLabel_matrucula;
    private javax.swing.JLabel jLabel_modelo;
    private javax.swing.JLabel jLabel_pintura;
    private javax.swing.JLabel jLabel_tipo;
    private javax.swing.JRadioButton jRadioButton_terceros;
    private javax.swing.JRadioButton jRadioButton_todoRiesgo;
    private javax.swing.JTextField jTextField_color;
    private javax.swing.JTextField jTextField_matricula;
    private javax.swing.JTextField jTextField_modelo;
    // End of variables declaration//GEN-END:variables
}
