/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arvore;

/**
 *
 * @author lucas.amsantos4
 */
public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();
        arvore.insere(10);
        arvore.insere(5);
        arvore.insere(11);
        arvore.insere(12);
        
        arvore.imprimiInOrdem();
        System.out.println("\n\n");
        
        arvore.removeGrauUm(11);
        arvore.imprimiInOrdem();
        System.out.println("\n\n");
        
        arvore.removeGrauZero(12);
        arvore.imprimiInOrdem();
        
    }
}
