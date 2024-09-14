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
        lista.remover();
        lista.insere(100);
        lista.insere(13, 2);
        lista.imprimir();
        System.out.println(lista.tamanho());
        lista.getValorPorPos(4);
        lista.insereOrdenado(200);
        lista.imprimir();
    }
}