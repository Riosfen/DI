/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareacoches.vistas;

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
        
        img_buscar = new ImageIcon("images/buscar.jpeg");
        btn_buscar = new JButton(img_buscar);
        
        img_consultar = new ImageIcon("images/consultar.jpeg");
        btn_consultar = new JButton(img_consultar);
        
    }
    
}
