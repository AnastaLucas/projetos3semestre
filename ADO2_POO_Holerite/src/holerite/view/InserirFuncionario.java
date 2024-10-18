/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package holerite.view;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author lucas.amsantos4
 */
public class InserirFuncionario extends JFrame{
    private JPanel tela;
    private JPanel bloco1;
    private JPanel txt1;
   
    public InserirFuncionario(){
        setResizable(false);
        setTitle("Holerite - Inserir novo funcionario");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500, 200, 800, 500);
        setLocationRelativeTo(null);
        
        tela = new JPanel();
        tela.setBackground(Color.WHITE);
        setContentPane(tela);
        tela.setLayout(null);
        
        bloco1 = new JPanel();
        bloco1.setBackground(Color.WHITE);
        bloco1.setBounds(0, 0, 150, 40);
        
        txt1 = new CamposText("Nome");
        txt1.setBounds(20, 10, 150, 40);
        tela.add(txt1);
    }
}
