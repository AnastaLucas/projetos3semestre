/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Scanner;

/**
 *
 * @author lucas.amsantos4
 */
public class Pessoa {

    private String nome;
    private String rg;
    private String cpf;
    private String endereco;

    public Pessoa(String nome, String rg, String cpf, String endereco) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
    }
    
    public String retornarDados(){
        String dados = ""
                + "Nome: "+nome+"\n"
                + "Rg: "+rg+"\n"
                + "CPF: "+cpf+"\n"
                + "Endereco: "+endereco+"\n";
        return dados;
    }
    
}
