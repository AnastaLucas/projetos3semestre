/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaduplaencadeada;

/**
 *
 * @author lucas.amsantos4
 */
public class No {
    private double valor;
    private No proximo;
    private No anterior;

    public No(double valor){
        this.valor = valor;
        this.proximo = null;
        this.anterior = null;
    }
    
    public No getAnterior() {
        return anterior;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }
    
    

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
}
