/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package holerite.view;

import holerite.model.Funcionario;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author lucas.amsantos4
 */
public class Menu extends JFrame{
    private JTable tabelaFuncionarios;
    private JPanel tela;
    private JButton btnCadastrar;
    
    private JScrollPane spTabela;
    private JPanel pnlTabela;
    public Menu(){
        setResizable(false);
        setTitle("Holerite - Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500, 200, 800, 500);
        setLocationRelativeTo(null);
        
        tela = new JPanel();
        tela.setBackground(Color.WHITE);
        setContentPane(tela);
        tela.setLayout(null);
        
        pnlTabela = new JPanel(new BorderLayout());
        pnlTabela.setBackground(Color.lightGray);
        pnlTabela.setBounds(150, 25, 600, 400);
        tela.add(pnlTabela);
        
        btnCadastrar = new JButton("Inserir");
        btnCadastrar.setBounds(25, 50, 100, 20);
        tela.add(btnCadastrar);
        
        btnCadastrar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent x){
                  InserirFuncionario inserir = new InserirFuncionario();
                  inserir.setVisible(true);
                
            }
        });
        
       
    }
}
