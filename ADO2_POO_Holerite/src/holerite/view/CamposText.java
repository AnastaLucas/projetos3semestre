/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package holerite.view;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author lucas.amsantos4
 */
public class CamposText extends JPanel{
    private JLabel lbl;
    private JTextField txt;
    public CamposText(String texto){
        setBackground(Color.WHITE);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        
        lbl = new JLabel(texto);
        add(lbl);
        txt = new JTextField();
        txt.setMaximumSize(new Dimension(Integer.MAX_VALUE, txt.getPreferredSize().height)); 
        add(txt);
    }
}
