/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import main.pessoas.Aluno;
import main.pessoas.Professor;

/**
 *
 * @author lucas
 */
public class Interface {
    
    private String escolha;
    private boolean eProfessor = false;
    private boolean eAluno;
    int x;
    ArrayList<Professor> professores;
    ArrayList<Aluno> alunos;
    
    public Interface(){
        professores = new ArrayList<>();
        alunos= new ArrayList<>();
        while(true){
            
            System.out.println("Selecione:"
                    + "\n[P] - Adicionar professores"
                    + "\n[A] - Adicionar alunos"
                    + "\n[I] - Imprimir todos os dados"
                    + "\n[imP] - Imprimir apenas professores"
                    + "\n[imA] - Imprimir apenas alunos"
                    + "\n[SAIR] - Sair do sistema\n");

            Scanner sc = new Scanner(System.in);

            escolha = sc.next().toUpperCase();

            switch(escolha){
                case "P":
                    System.out.print("Quantos professores adicionar: ");
                    x = sc.nextInt();
                    
                    if(x>0) {
                        eProfessor = true;
                        Professor[] p = new Professor[x];
                        for(int i = 0; i < x; i++){
                            System.out.printf("Professor %d",i+1);
                            p[i] = preencherProfessor();
                            System.out.println("\n\n");
                        }
                    
                    }else{ 
                        eProfessor = false;
                    }
                    
                    System.out.flush();
                    System.out.println("\nTodos os dados preenchidos.\n");
                    break;
                case "A":
                    System.out.print("Quantos alunos adicionar: ");
                    x = sc.nextInt();
                    
                    if(x>0) {
                        eAluno = true;
                        Aluno[] a = new Aluno[x];
                        for(int i = 0; i < x; i++){
                            System.out.printf("Aluno %d",i+1);
                            a[i] = preencherAluno();
                            System.out.println("\n\n");
                        }
                    
                    }else{ 
                        eAluno = false;
                    }
                    
                    System.out.flush();
                    System.out.println("\nTodos os dados preenchidos.\n");
                    
                    break;
                case "I":
                    if(eProfessor == true || eAluno == true){
                        for(Professor p : professores){
                            System.out.println("Dados Professor:");
                            System.out.println(p.retornarDadosProf());
                            System.out.println("\t-------------------");
                        }
                        
                        for(Aluno a : alunos){
                            System.out.println("Dados Aluno::");
                            System.out.println(a.retornarDadosAlunos());
                            System.out.println("\t-------------------");
                        }
                    }else{ 
                        System.out.println("Dados ainda nao foram cadastrados");
                    }
                    break;
                case "IMP":
                    if(eProfessor == true){
                        for(Professor p : professores){
                            System.out.println("Dados Professor:");
                            System.out.println(p.retornarDadosProf());
                            System.out.println("\t-------------------");
                        }
                    }else{ 
                        System.out.println("Dados ainda nao foram cadastrados");
                    }
                    break;
                case "IMA":
                    if(eAluno == true){
                        for(Aluno a : alunos){
                            System.out.println("Dados Aluno:");
                            System.out.println(a.retornarDadosAlunos());
                            System.out.println("\t-------------------");
                        }
                    }else{ 
                        System.out.println("Dados ainda nao foram cadastrados");
                    }
                    break;
                case "SAIR":
                    System.out.println("\nEncerrando.\n\n");
                    System.exit(0);
                    break;
                default:
                    System.out.flush();
                    System.out.println("\n\nOpçao Invalida.");
            }
      
        }
    
    }
    public Professor preencherProfessor(){
        System.out.println("\n\t---Dados do Professor---");
        
        Scanner scP = new Scanner(System.in);
        
        System.out.print("Digite Nome: ");
        String nome = scP.next();
        
        System.out.print("Digite Rg: ");
        String rg = scP.next();
        
        System.out.print("Digite Cpf: ");
        String cpf = scP.next();
        
        System.out.print("Digite Endereco: ");
        String endereco = scP.next();
        
        System.out.print("Digite Data de Admissao: ");
        String dataAdmissao = scP.next();
        
        System.out.print("Digite Matricula: ");
        int matricula = scP.nextInt();
        
        System.out.print("Digite Salario hora: ");
        double salarioHora = scP.nextDouble();
        
        
        Professor p = new Professor(dataAdmissao, matricula, salarioHora, nome, rg, cpf, endereco);
        professores.add(p);
        return p;  
    }
    
    public Aluno preencherAluno(){
        System.out.println("\n\t---Dados do Aluno---");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite Nome: ");
        String nome = sc.next();
        
        System.out.print("Digite Rg: ");
        String rg = sc.next();
        
        System.out.print("Digite Cpf: ");
        String cpf = sc.next();
        
        System.out.print("Digite Endereco: ");
        String endereco = sc.next();
        
        System.out.print("Digite Rgistro do Aluno: ");
        int registroAluno = sc.nextInt();
        
        System.out.print("Digite nota Vestibular: ");
        float notaVestibular = sc.nextFloat();
        
        System.out.print("Digite Curso: ");
        String curso = sc.nextLine();
        
        System.out.print("Digite Matricula: ");
        String dataMatricula = sc.next();
        
        
        Aluno p = new Aluno(registroAluno, notaVestibular, curso, dataMatricula, nome, rg, cpf, endereco);
        alunos.add(p);
        return p;  
    }
}
