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
public class Professor extends Pessoa{

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }
    private String dataAdmissao;
    private int matricula;
    private double salarioHora;
    
    public String retornarDadosProf(){
        System.out.println("Dados Professor");
        String dados = super.retornarDados()
                + "Data Admissao: "+dataAdmissao+"\n"
                + "Matricula: "+matricula+"\n"
                + "Salario por Hora: "+salarioHora+"\n";
        return dados;
    }
}
