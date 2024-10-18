/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package holerite.calculos;

/**
 *
 * @author lucas.amsantos4
 */
public class CalculoConvenioMed {
    public double calculoConvMed(double salario){
        if(salario>1412){
            return salario*0.04;
        }
        return 0;
    }
}
