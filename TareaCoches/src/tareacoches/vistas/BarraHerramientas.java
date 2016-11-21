/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareacoches.vistas;

import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;

/**
 *
 * @author riosfen
 */
public class BarraHerramientas extends JToolBar{
    
    private JButton btn_buscar, btn_consultar;
    private ImageIcon img_buscar, img_consultar;
    
    public BarraHerramientas(){
        
        super.setFloatable(false);
        
        img_buscar = new ImageIcon("images/buscar.jpeg");
        btn_buscar = new JButton(img_buscar);
        btn_buscar.setToolTipText("Buscar");
        
        img_consultar = new ImageIcon("images/consultar.jpeg");
        btn_consultar = new JButton(img_consultar);
        btn_consultar.setToolTipText("Consultar");
        
        this.add(btn_buscar);
        this.add(btn_consultar);
        
    }
    
    public void addControlador (ActionListener e){
        
        btn_buscar.addActionListener(e);
        btn_consultar.addActionListener(e);
        
        btn_buscar.setActionCommand("buscar");
        btn_consultar.setActionCommand("consultar");
        
    }
    
}
