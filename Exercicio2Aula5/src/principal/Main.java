/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import java.util.Scanner;
import principal.heranca.pessoas.Aluno;
import principal.heranca.pessoas.Professor;

/**
 *
 * @author lucas.amsantos4
 */
public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Professor professor = new Professor();
        
        System.out.println("\t --PREENCHER DADOS--");
        preencherProfessor(professor);
        System.out.println("\n");
        
        preencherAluno(aluno);
        System.out.println("\n\n");
        
        System.out.println("\n\n\t --IMPRESSAO DOS DADOS--\n");
        System.out.println(professor.retornarDadosProf());
        System.out.println(aluno.retornarDadosAluno());
        
        
    }
    
    public static void preencherProfessor(Professor professor){
        
        System.out.println("Dados do Professor");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite Nome: ");
        professor.setNome(sc.next());
        System.out.print("Digite Rg: ");
        professor.setRg(sc.next());
        System.out.print("Digite Cpf: ");
        professor.setCpf(sc.next());
        System.out.print("Digite Endereco: ");
        professor.setEndereco(sc.next());
        System.out.print("Digite Data de Admissao: ");
        professor.setDataAdmissao(sc.next());
        System.out.print("Digite Matricula: ");
        professor.setMatricula(sc.nextInt());
        System.out.print("Digite Salario hora: ");
        professor.setSalarioHora(sc.nextInt());
        
        
    }
    
    public static void preencherAluno(Aluno aluno){
        
        System.out.println("Dados do Aluno");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite Nome: ");
        aluno.setNome(sc.next());
        System.out.print("Digite Rg: ");
        aluno.setRg(sc.next());
        System.out.print("Digite Cpf: ");
        aluno.setCpf(sc.next());
        System.out.print("Digite Endereco: ");
        aluno.setEndereco(sc.next());
        System.out.print("Digite Curso: ");
        aluno.setCurso(sc.next());
        System.out.print("Digite Matricula: ");
        aluno.setDataMatricula(sc.next());
        System.out.print("Digite Nota Vestibular: ");
        aluno.setNotaVestibular(sc.nextInt());
        System.out.print("Digite Registro: ");
        aluno.setRegistroAluno(sc.nextInt());
        
        
    }
}
