/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.pessoas;

import main.Pessoa;

/**
 *
 * @author lucas.amsantos4
 */
public class Professor extends Pessoa{
    
    private String dataAdmissao;
    private int matricula;
    private double salarioHora;


    public Professor(String dataAdmissao, int matricula, double salarioHora, String nome, String rg, String cpf, String endereco) {
        super(nome, rg, cpf, endereco);
        this.dataAdmissao = dataAdmissao;
        this.matricula = matricula;
        this.salarioHora = salarioHora;
    }
    
    public String retornarDadosProf(){
        String dados = super.retornarDados()
                + "Data Admissao: "+dataAdmissao+"\n"
                + "Matricula: "+matricula+"\n"
                + "Salario por Hora: "+salarioHora+"\n";
        return dados;
    }
    
}
