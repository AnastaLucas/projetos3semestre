/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal.heranca.pessoas;

import principal.heranca.Pessoa;

/**
 *
 * @author lucas.amsantos4
 */
public class Aluno extends Pessoa{

    public void setRegistroAluno(int registroAluno) {
        this.registroAluno = registroAluno;
    }

    public void setNotaVestibular(float notaVestibular) {
        this.notaVestibular = notaVestibular;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }
    private int registroAluno;
    private float notaVestibular;
    private String curso;
    private String dataMatricula;
    
    public String retornarDadosAluno(){
        System.out.println("Dados Alunos");
        String dados = super.retornarDados()
                + "RA: "+registroAluno+"\n"
                + "Nota vestibular: "+notaVestibular+"\n"
                + "Curso: "+curso+"\n"
                + "Data Matricula: "+dataMatricula+"\n";
        return dados;
    }
    
}
