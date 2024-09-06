/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasimples;

/**
 *
 * @author lucas.amsantos4
 */
public class Main {
    public static void main(String[] args) {
        ListaSimples lista = new ListaSimples();
        lista.insere(20);
        lista.insere(15);
        lista.insere(5);
        lista.insere(100);
        lista.insere(13, 2);
        lista.imprimir();
        
        lista.ordenar();
        System.out.println("\n");
        lista.imprimir();
        
        System.out.println("\n");
        lista.insere(25);
        lista.imprimir();
        System.out.println("\n");
        
        lista.inserirOrdenado(200);
        lista.imprimir();
    }
}