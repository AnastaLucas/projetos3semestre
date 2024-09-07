/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaduplaencadeada;

/**
 *
 * @author lucas.amsantos4
 */
public class ListaDuplamenteEncadeada {
    
    private No inicio;
    private No fim;
    private int tamanho;
    
    public ListaDuplamenteEncadeada(){
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }
    public boolean listaVazia(){
        return tamanho()==0;
    }
    public int tamanho(){
        return this.tamanho;
    }
    
    private void inserePrimeiro(double valor){
        this.inicio = new No(valor);
        this.fim = this.inicio;
        this.tamanho = 1;
    }
    
    private void insereUltimo(double valor){
        No aux = new No(valor);
        this.fim.setProximo(aux);
        aux.setAnterior(fim);
        this.fim = aux;
        tamanho++;
    }
    
    private void insereInicio(double valor){
        No aux = new No(valor);
        aux.setProximo(this.inicio);
        this.inicio.setAnterior(aux);
        this.inicio = aux;
        tamanho++;
    }
    
    private void insereMeio(double valor, int pos){
        No aux = new No(valor);   
        if(tamanho()>pos && pos>0 ){
            pos-=1;
            if(tamanho()-pos > tamanho()/2){
                //Do Inicio ao Fim
                No esquerda = this.inicio;
                for(int i = 0; i<pos;i++){
                    esquerda = esquerda.getProximo();
                }
                aux.setProximo(esquerda.getProximo());
                esquerda.getProximo().setAnterior(aux);
                esquerda.setProximo(aux);
                aux.setAnterior(esquerda);
            }else{
                //Do Fim ao Inicio
                No direita = new No(valor);
                for(int i = tamanho();i>pos;i--){
                    direita = direita.getAnterior();
                }
                aux.setProximo(direita.getProximo());
                direita.getProximo().setAnterior(aux);
                direita.setProximo(aux);
                aux.setAnterior(direita);
            }
        }else if(pos==0){
            insereInicio(valor);
        }
        
        this.tamanho++;
    }
}
