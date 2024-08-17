
package main;

import lista.*;

public class Main {
    public static void main(String[] args) {
    ListaEstatica lista = new ListaEstatica();
    lista.insere(0);
    lista.insere(1);
    lista.insere(10);
    lista.insere(2);
    lista.insere(3);
    lista.insere(43, 1);
    lista.insere(10);
    
    lista.imprimeLista();
    
        System.out.println("\n----\n");
    
    lista.remover(0);
    
    lista.imprimeLista();
    }
}
