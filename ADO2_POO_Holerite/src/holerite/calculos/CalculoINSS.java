/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package holerite.calculos;

/**
 *
 * @author lucas.amsantos4
 */
public class CalculoINSS {
    public double calculoINSS(double salario){
        double desconto;
        if(salario>4000.03 && salario<7786.02){
            desconto = (salario*0.14)-181.18;
        }else if(salario>2666.68){
            desconto = (salario*0.12)-101.18;
        }else if(salario>1412){
            desconto = (salario*0.09)-21.18;
        }else{
            desconto = salario*0.075;
        }
        return desconto;
    }
}
