/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import java.util.Scanner;
import principal.calculos.Calculadora;

/**
 *
 * @author lucas.amsantos4
 */
public class Main {
    public static void main(String[] args) {
        double n1, n2, resposta = 0;
        String operacao;
        
        System.out.println("Digite o valor de n1: ");
        Scanner scS = new Scanner(System.in);
        n1 = scS.nextDouble();
        
        System.out.println("Digite o valor total de n2: ");
        Scanner scD = new Scanner(System.in);
        n2 = scD.nextDouble();
        
        System.out.println("Digite  +  -  /  *  ");
        Scanner scO = new Scanner(System.in);
        operacao = scO.next();
        
        Calculadora calculo = new Calculadora(n1, n2);
        
        switch(operacao){
            case "+":
                resposta = calculo.Adicao();
                break;
            case "-":
                resposta = calculo.Subtracao();
                break;
            case "*":
                resposta = calculo.Multiplica();
                break;
            case "/":
                resposta = calculo.Divisao();
                break;
            default:
                System.out.println("Digite um valor valido.");
        }
        
        System.out.printf("\nO resultado é %.2f \n", resposta);
        
        
    }
}
