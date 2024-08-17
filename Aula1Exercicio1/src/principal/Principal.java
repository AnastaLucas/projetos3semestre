/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import calculos.Quadrado;
import java.util.Scanner;

/**
 *
 * @author lucas.amsantos4
 */
public class Principal {
    
    public static void main(String[] args) {
        double numero;
        System.out.println("Digite um numero: ");
        Scanner sc = new Scanner(System.in);
        numero = sc.nextDouble();
        Calculos calculo = new Calculos(numero);
        sc.reset();
        
        System.out.printf("\nO triplo de %.2f e %.2f ",numero, calculo.triplo());
        System.out.printf("\nO quadruplo de %.2f e %.2f ",numero, calculo.quadruplo());
        System.out.println("\nDigite o exponencial: ");
        double ex = sc.nextDouble();
        Quadrado q = new Quadrado(numero, ex);
        System.out.printf("O resultado é %.2f\n", q.quadrado());
    }
}
