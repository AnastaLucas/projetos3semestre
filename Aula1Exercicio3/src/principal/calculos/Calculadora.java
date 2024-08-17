/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal.calculos;

/**
 *
 * @author lucas.amsantos4
 */
public class Calculadora {

    public Calculadora(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    public double Multiplica(){
        return n1*n2;
    }
    public double Divisao(){
        return n1/n2;
    }
    public double Subtracao(){
        return n1-n2;
    }
    public double Adicao(){
        return n1+n2;
    }
    double n1;
    double n2;
}
