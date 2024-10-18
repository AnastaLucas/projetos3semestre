/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package holerite.calculos;

/**
 *
 * @author lucas.amsantos4
 */
public class CalculoVA {
    public double calculoVA(double salario){
        if(salario>1412*3) return salario*0.02;
        return 0;
    }
}
