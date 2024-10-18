/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package holerite.model;

/**
 *
 * @author lucas.amsantos4
 */
public abstract class Pessoa {
    private String nome;
    private String rg;
    private String cpf;

    public Pessoa(String nome, String rg, String cpf) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
    }
}