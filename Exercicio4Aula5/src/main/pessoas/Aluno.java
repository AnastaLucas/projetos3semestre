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


    public Aluno(int registroAluno, float notaVestibular, String curso, String dataMatricula, String nome, String rg, String cpf, String endereco) {
        super(nome, rg, cpf, endereco);
        this.registroAluno = registroAluno;
        this.notaVestibular = notaVestibular;
        this.curso = curso;
        this.dataMatricula = dataMatricula;
    }
    
    public String retornarDados(){
        System.out.println("Dados Alunos");
        String dados = super.retornarDados()
                + "RA: "+registroAluno+"\n"
                + "Nota vestibular: "+notaVestibular+"\n"
                + "Curso: "+curso+"\n"
                + "Data Matricula: "+dataMatricula+"\n";
        return dados;
    }
}
