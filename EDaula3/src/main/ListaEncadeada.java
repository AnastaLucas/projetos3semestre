/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.LinkedList;

/**
 *
 * @author lucas.amsantos4
 */
public class ListaEncadeada {
    private LinkedList<String> nomes;

    public ListaEncadeada() {
        nomes = new LinkedList();
    }
    
    public void inserirPrimeiro(String nome){
        nomes.addFirst(nome);
    }
    public void inserirUltimo(String nome){
        nomes.addLast(nome);
    }
    public void inserirMeio(String nome){
        nomes.add(nome);
    }
    public void inserir(String nome, int n){
        
    }
    
    
    
    public void imprimir(){
        int i = 0;
        nomes.stream().forEach(x -> System.out.printf("[%d] - %s", x));
    }
}
