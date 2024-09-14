/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaduplaencadeada;

/**
 *
 * @author lucas.amsantos4
 */
public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
        
        int x = 100000000;
        for(int i = 0; i<x;i++){
            lista.insere(10*i);
        }
        lista.imprimir();
        System.out.println("\n|"+lista.tamanho()
                + "\n-------");
        lista.remover(97);
        System.out.println("|"+lista.tamanho()+"\n");
        
        lista.imprimir();
    }
}
