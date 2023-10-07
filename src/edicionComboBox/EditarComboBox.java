/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edicionComboBox;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.plaf.ComboBoxUI;
import javax.swing.plaf.basic.BasicArrowButton;
import javax.swing.plaf.basic.BasicComboBoxUI;

/**
 *
 * @author suare
 */
public class EditarComboBox extends BasicComboBoxUI {
     Color color1 = new Color(0, 222, 157);
     Color color2 = new Color(170, 170, 170);

    //metodo para visualizar combobox
    public static ComboBoxUI createUI(JComponent com) {
        return new EditarComboBox();
    }

    @Override
    protected JButton createArrowButton() {
        JButton btn = new JButton();
        btn.setIcon(new ImageIcon(getClass().getResource("/imagenes/flechabajogrande.png")));
        btn.setBorder(BorderFactory.createLineBorder(color2, 1));
        return btn;
    }

    public void paintCurrentValueBackground(Graphics g, Rectangle bounds, boolean hasFocus) {

        g.setColor(Color.WHITE);
        g.fillRect(bounds.x, bounds.y, bounds.width, bounds.height);
    }

    @Override
    protected ListCellRenderer createRenderer() {
        
        return new DefaultListCellRenderer(){

            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus); //To change body of generated methods, choose Tools | Templates.
                
                
                list.setSelectionBackground(color1);
                    
               
               
                
                return this;
            }

        };
    }
    
    
    
    
    
}
