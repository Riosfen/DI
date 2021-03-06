/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

/**
 *
 * @author samo_
 */
public class Vista extends javax.swing.JPanel {
    
    /**
     * Creates new form Vista
     */
    public Vista() {
        initComponents();
        /**
         * Esto es para que abra correctamente un .html
         * y para que no se pueda editar el contenido
         */
        jComboNumeros.isEditable();
        jTextPane.setContentType("text/html");
        jTextPane.setEditable(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelHerramienta = new javax.swing.JPanel();
        contenedorJTextpane = new javax.swing.JScrollPane();
        jTextPane = new javax.swing.JTextPane();
        jPanelBuscador = new javax.swing.JPanel();
        textBuscador = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JPanel();
        herramientas = new javax.swing.JPanel();
        btn_negrita = new javax.swing.JButton();
        btn_cursiva = new javax.swing.JButton();
        btn_subrayar = new javax.swing.JButton();
        jComboNumeros = new javax.swing.JComboBox(numeros);
        btn_editar = new javax.swing.JButton();
        contenedorJTextPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();

        setLayout(new java.awt.BorderLayout());

        panelHerramienta.setLayout(new java.awt.BorderLayout());

        contenedorJTextpane.setViewportView(jTextPane);

        panelHerramienta.add(contenedorJTextpane, java.awt.BorderLayout.CENTER);

        jPanelBuscador.setLayout(new java.awt.BorderLayout());

        textBuscador.setText("http://www.google.es");
        jPanelBuscador.add(textBuscador, java.awt.BorderLayout.CENTER);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanelBuscador.add(btnBuscar, java.awt.BorderLayout.LINE_END);

        panelHerramienta.add(jPanelBuscador, java.awt.BorderLayout.PAGE_START);

        jTabbedPane1.addTab("Ejemplo1", panelHerramienta);

        jTabbedPane2.setLayout(new java.awt.BorderLayout());

        herramientas.setLayout(new java.awt.GridLayout(1, 0));

        btn_negrita.setText("Negrita");
        herramientas.add(btn_negrita);

        btn_cursiva.setText("Cursiva");
        herramientas.add(btn_cursiva);

        btn_subrayar.setText("Subrayado");
        herramientas.add(btn_subrayar);
        herramientas.add(jComboNumeros);

        btn_editar.setText("Editar");
        herramientas.add(btn_editar);

        jTabbedPane2.add(herramientas, java.awt.BorderLayout.PAGE_START);

        contenedorJTextPane2.setViewportView(jTextPane2);

        jTabbedPane2.add(contenedorJTextPane2, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Ejemplo2", jTabbedPane2);

        add(jTabbedPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    public JTextField getUrl(){
        
        return textBuscador;
        
    }
    public void cargarPaginaWeb(String str){
    
        /**
         * aqui le añadimos la url de la pagina que queremos abrir
         * y lo controlamos con un try-catch
         */
        try {
            jTextPane.setPage(str);
        } catch (IOException ex) {
            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public void controlador(ActionListener e){
    
        btnBuscar.addActionListener(e);
        btn_negrita.addActionListener(e);
        btn_cursiva.addActionListener(e);
        btn_subrayar.addActionListener(e);
        btn_editar.addActionListener(e);
        jComboNumeros.addActionListener(e);
        
        btnBuscar.setActionCommand("buscar");
        btn_negrita.setActionCommand("negrita");
        btn_cursiva.setActionCommand("cursiva");
        btn_subrayar.setActionCommand("subrayar");
        btn_editar.setActionCommand("editar");
        jComboNumeros.setActionCommand("numero");
        
    }
    
    public void setNegrita(){
    
        SimpleAttributeSet simp = new SimpleAttributeSet();
        StyleConstants.setBold(simp, true);
        jTextPane2.setCharacterAttributes(simp, true);
        
    }
    
    public void setCursiva(){
    
        SimpleAttributeSet simp = new SimpleAttributeSet();
        StyleConstants.setItalic(simp, true);
        jTextPane2.setCharacterAttributes(simp, true);
        
    }
    
    public void setSubrayado(){
    
        SimpleAttributeSet simp = new SimpleAttributeSet();
        StyleConstants.setUnderline(simp, true);
        jTextPane2.setCharacterAttributes(simp, true);
        
    }
    
    public void setEditar(){
    
        SimpleAttributeSet simp = new SimpleAttributeSet();
        jTextPane2.setCharacterAttributes(simp, true);
        
    }
    
    public void setTamanio(){
        
        int size = (Integer)jComboNumeros.getSelectedItem();
        
        SimpleAttributeSet simp = new SimpleAttributeSet();
        StyleConstants.setFontSize(simp, size);
        jTextPane2.setCharacterAttributes(simp, true);
        
    }
    Integer[] numeros = {8, 10, 12, 14, 18, 20, 24, 32, 48, 56, 69};
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btn_cursiva;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_negrita;
    private javax.swing.JButton btn_subrayar;
    private javax.swing.JScrollPane contenedorJTextPane2;
    private javax.swing.JScrollPane contenedorJTextpane;
    private javax.swing.JPanel herramientas;
    private javax.swing.JComboBox<String> jComboNumeros;
    private javax.swing.JPanel jPanelBuscador;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel jTabbedPane2;
    private javax.swing.JTextPane jTextPane;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JPanel panelHerramienta;
    private javax.swing.JTextField textBuscador;
    // End of variables declaration//GEN-END:variables
}
