/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaSimples;

/**
 *
 * @author lucas.amsantos4
 */
public class ListaSimples {
    
    private No inicio;
    private No fim;
    private int tamanho;

    public ListaSimples() {
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
        No aux = new No(valor);
        this.inicio = aux;
        this.fim = aux;
        tamanho = 1;
    }
    
    private void insereUltimo(double valor){
        No aux = new No(valor);
        this.fim.setProximo(aux);
        this.fim = aux;
        this.tamanho++;
    }
    
    public void insereInicio(double valor){
        No aux = new No(valor);
        aux.setProximo(inicio);
        this.inicio = aux;
        this.tamanho++;
    }
    
    public void insere(double valor){
        if(listaVazia()){
            inserePrimeiro(valor);
        }else{
            insereUltimo(valor);
        }
    }
    
    public void insere(double valor, int pos){
        No aux = new No(valor);
        No proxAnt = this.inicio;
        
        if(tamanho()>pos && pos>0 ){
            pos-=1;
            for(int i = 0; i<pos;i++){
                proxAnt = proxAnt.getProximo();
            }
            aux.setProximo(proxAnt.getProximo());
            proxAnt.setProximo(aux);
            
            this.tamanho++;
            
            
        }
        
    }
    
    public void imprimir(){
        No aux = this.inicio; 
        for(int i = 0; i<tamanho(); i++){
            System.out.printf("\n[%s] - %.2f ",i, aux.getValor());
            aux = aux.getProximo();
        }
    }
    
    public void remover(int pos){
        
        if(tamanho>pos && pos>0){
            removerSelecao(pos);
        }else if(pos==0){
        }
    }
    public void removerUltimo(){
        No rmv = this.inicio;
        No antRmv;
        for(int i = 0; i<tamanho;i++){
            antRmv = rmv;
            rmv = rmv.getProximo();
        }
        System.out.println(rmv.getValor());
    }
    private void removerSelecao(int pos){
        No rmv = this.inicio;
        No antRmv = new No(rmv.getValor());
        for(int i = 0; i<pos;i++){
            antRmv = rmv;
            rmv = rmv.getProximo();
        }
        antRmv.setProximo(rmv.getProximo());
        this.tamanho--;
    }
   
    
}
