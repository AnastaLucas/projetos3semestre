/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package holerite.calculos;

/**
 *
 * @author lucas.amsantos4
 */
public class CalculoVT {
    //20 dias de trabalho por mes 5x2
    public double calculoVT(double salario, double conducao){
        conducao = conducao*20;
        if(conducao != 0){
            if(salario*0.06>=conducao) return conducao;
            return salario*0.06;
        }
        return 0;
    }
}
