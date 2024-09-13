/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author lucas.amsantos4
 */
public class Calculos {
    private double x;
     private double y;
     private double resultado;
    private String operacao;
    
    
    public Calculos(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }
    
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    public void adicao(){
        resultado = x+y;
    }
    
    public void subtracao(){
        resultado =  x-y;
    }
    
    public void divisao()throws ArithmeticException{
        
        if(y == 0)throw new ArithmeticException();
        resultado =  x/y;
        
    }
    
    public void multiplicacao(){
        resultado =  x*y;
    }
    
    public double resultado(){
        return this.resultado;
    }
}
