/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author lucas.amsantos4
 */
public class Frame extends JFrame{
    private JPanel tela;
    private JLabel label;
    private JTextField texto;
    public Frame(){
        setResizable(false);
        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500, 200, 400, 400);
        setLocationRelativeTo(null);
        
        tela = new JPanel();
        tela.setBackground(Color.BLACK.WHITE);
        setContentPane(tela);
        tela.setLayout(null);
        
        texto = new JTextField();
        texto.setBounds(10, 20, 200, 40);
        tela.add(texto);
        
        label = new JLabel(texto.getText());
        label.setBounds(40, 20, 200, 40);
        tela.add(label);
        
    }
}
