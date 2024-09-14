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
        No auxDois;
        if(tamanho()-pos > tamanho()/2){
            //Do Inicio ao Fim
            auxDois = this.inicio;
            for(int i = 0; i<pos-1;i++){
                auxDois = auxDois.getProximo();
            }
            // 10 - 3 = 7 esq 
            //10 - 6 = 4 dir
        }else{
            //Do Fim ao Inicio
            auxDois = this.fim;
            for(int i = tamanho();i>pos;i--){
                auxDois = auxDois.getAnterior();
            }
        }
        aux.setProximo(auxDois.getProximo());
        auxDois.getProximo().setAnterior(aux);
        auxDois.setProximo(aux);
        aux.setAnterior(auxDois);
        
        this.tamanho++;
    }
    
    public void insere(double valor){
        if(tamanho()==0){
            inserePrimeiro(valor);
        }else{
            insereUltimo(valor);
        }
    }
    public void insere(double valor, int pos){
        
        if(tamanho() == 0){
            inserePrimeiro(valor);
            return;
        }
        if(pos >= tamanho()){
            insereUltimo(valor);
        }else if(pos == 0){
            insereInicio(valor);
        }else if(pos>0 && pos < tamanho()){
            insereMeio(valor, pos);
        }   
        
    }
    
    private void removerUltimo(){
        this.fim = this.fim.getAnterior();
        this.fim.setProximo(null);
        System.gc();
        this.tamanho--;
    }
    
    private void removerPrimeiro(){
       this.inicio = this.inicio.getProximo();
       this.tamanho--;
    }
    private void removerUnico(){
        this.inicio = null;
        this.fim = null;
        System.gc();
        this.tamanho = 0;
    }
    
    private void removerMeio(int pos){
        No rmv;
        if(tamanho()-pos > tamanho()/2){
            rmv = this.inicio;
            //Do Inicio ao Fim
            for(int i = 0; i<pos;i++){
                rmv = rmv.getProximo();
            }
            // 10 - 3 = 7 esq 
            //10 - 6 = 4 dir
        }else{
            rmv = this.fim;
            //Do Fim ao Inicio
            for(int i = tamanho();i>pos+1;i--){
                rmv = rmv.getAnterior();
            }
        }
        rmv.getAnterior().setProximo(rmv.getProximo());
        rmv.getProximo().setAnterior(rmv.getAnterior());
        rmv = null;
        System.gc();
        this.tamanho--;
    }
    
    public void remover(){
        if(tamanho()<=1){
            removerUnico();
        }else{
            removerUltimo();
        }
    }
    
    public void remover(int pos){
        if(pos == 0){
            removerPrimeiro();
        }else if(pos>0 && pos<tamanho()-1){
            removerMeio(pos);
        }else{
            removerUltimo();
        }
    }
    
    public void imprimir(){
        No aux = this.inicio;
        for(int i = 0; i<tamanho();i++){
                System.out.printf("[%d] - %.2f\n", i, aux.getValor());
                aux = aux.getProximo();
            }
    }
    public void imprimirInverso(){
        No aux = this.fim;
        for(int i = tamanho(); i>0;i--){
                System.out.printf("[%d] - %.2f\n", i, aux.getValor());
                aux = aux.getAnterior();
            }
    }
}
