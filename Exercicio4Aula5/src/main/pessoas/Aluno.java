/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.pessoas;

import java.util.Scanner;
import main.Pessoa;

/**
 *
 * @author lucas.amsantos4
 */
public class Aluno extends Pessoa{
    private int registroAluno;
    private float notaVestibular;
    private String curso;
    private String dataMatricula;

    public void inserirDados(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite Nome: ");
        super.setNome(curso);
        
        System.out.print("Digite Rg: ");
        super.setRg(curso);
        
        System.out.print("Digite Cpf: ");
        super.setCpf(curso);
        
        System.out.print("Digite Endereco: ");
        super.setEndereco(curso);
        
        System.out.print("Digite Registro Aluno: ");
        this.registroAluno = sc.nextInt();

        System.out.print("Digite Nota Vestibular: ");        
        this.notaVestibular = sc.nextFloat();
        
        System.out.print("Digite Curso: ");
        this.curso = sc.next();
        
        System.out.print("Digite data Matricula: ");
        this.dataMatricula = sc.next();
    }
    
    public void retornarDados(){
        
    }
}
