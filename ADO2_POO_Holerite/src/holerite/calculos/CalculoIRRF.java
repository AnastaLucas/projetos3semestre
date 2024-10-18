/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package holerite.calculos;

/**
 *
 * @author lucas.amsantos4
 */
public class CalculoIRRF {
    //recebe salario com inss
    public double calculoIRRF(double salario){
        double desconto;
        
        if(salario>4664.68){
            desconto = (salario*0.275)-884.96;
        }else if(salario>3751.05){
            desconto = (salario*0.225)-651.73;
        }else if(salario>2826.65){
            desconto = (salario*0.15)-370.4;
        }else if(salario>2112){
            desconto = (salario*0.075)-158.4;
        }else{
            desconto = 0;
        }
        
        return desconto;
    }
}
