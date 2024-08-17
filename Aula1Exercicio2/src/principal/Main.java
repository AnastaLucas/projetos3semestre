/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import calculos.Salario;
import java.util.Scanner;

/**
 *
 * @author lucas.amsantos4
 */
public class Main {
    public static void main(String[] args) {
        double salarioBruto, salarioLiquido, desconto;
        System.out.println("Digite o valor do salario bruto: ");
        Scanner scS = new Scanner(System.in);
        salarioBruto = scS.nextDouble();
        
        System.out.println("Digite o valor total dos descontos: ");
        Scanner scD = new Scanner(System.in);
        desconto = scD.nextDouble();
        
        Salario calculo = new Salario(salarioBruto, desconto);
        
        
        System.out.printf("Seu salario liquido é %.2f",calculo.salarioLiquido());
    }
}
