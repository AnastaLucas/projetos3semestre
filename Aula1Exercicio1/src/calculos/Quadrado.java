/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculos;

/**
 *
 * @author lucas.amsantos4
 */
public class Quadrado {
    double numero, exponecial;
    public Quadrado(double numero, double exponecial){
        this.numero = numero;
        this.exponecial = exponecial;
    }
    public double quadrado(){
        return Math.pow(numero, exponecial);
    }
}
