/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculos;

/**
 *
 * @author lucas.amsantos4
 */
public class Salario {
    double salarioBruto;
    double descontos;
    
    public Salario(double salarioBruto, double descontos) {
        this.salarioBruto = salarioBruto;
        this.descontos = descontos;
    }
    public double salarioLiquido(){
        return salarioBruto - descontos;
    }
    
    
}
