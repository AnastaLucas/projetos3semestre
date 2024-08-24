/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaSimples;

/**
 *
 * @author lucas.amsantos4
 */
public class Main {
    public static void main(String[] args) {
        ListaSimples lista = new ListaSimples();
        lista.insere(10);
        lista.insere(20);
        lista.insere(30);
        lista.insere(40);
        lista.insere(15, 2);
        lista.imprimir();
        
        lista.remover(0);
        
        lista.imprimir();
    }
}
