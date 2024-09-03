/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaSimples;

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
        
        System.out.println("\n"+lista.getIndex(30));
        System.out.println("\n\n");
        lista.imprimir();
    }
}
