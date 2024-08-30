/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal.heranca;

/**
 *
 * @author lucas.amsantos4
 */
public class Pessoa {

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    private String nome;
    private String rg;
    private String cpf;
    private String endereco;
    
    public String retornarDados(){
        String dados = ""
                + "Nome: "+nome+"\n"
                + "Rg: "+rg+"\n"
                + "CPF: "+cpf+"\n"
                + "Endereco: "+endereco+"\n";
        return dados;
    }
    
}
