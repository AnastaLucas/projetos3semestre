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
public class Funcionario extends Pessoa {

    public void setMatriculaFuncionario(int matriculaFuncionario) {
        this.matriculaFuncionario = matriculaFuncionario;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public void setDataAdmissao(String dataAdmissão) {
        this.dataAdmissao = dataAdmissão;
    }
    
    private int matriculaFuncionario;
    private double salarioMensal;
    private String dataAdmissao;
    
    
    public String retornarDadosFuncionario(){
        System.out.println("Dados Funcionarios");
        String dados = super.retornarDados()
                + "Matricula: "+matriculaFuncionario+"\n"
                + "Salario Mensal: "+salarioMensal+"\n"
                + "Data Admissao: "+dataAdmissao+"\n";
        return dados;
    }
}
