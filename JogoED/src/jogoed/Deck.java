/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogoed;

import jogoed.cartas.Carta;

/**
 *
 * @author lucas.amsantos4
 */
public class Deck {
    private Carta inicio;
    private Carta fim;
    private int tamanho;
    
    public Deck() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }
    
    public int tamanho(){
        return this.tamanho;
    }
    public boolean deckVazio(){
        return tamanho()==0;
    }
    
    public void insere(Carta pokemon){
        if(deckVazio()){
            
            inserePrimeiro(pokemon);
        }else{
            
            insereUltimo(pokemon);
        }
    }
    
    private void inserePrimeiro(Carta pokemon){
        Carta aux = pokemon;
        this.inicio = aux;
        this.fim = aux;
        tamanho = 1;
        
    }
    private void insereUltimo(Carta pokemon){
        Carta aux = pokemon;
        this.fim.setProximo(aux);
        this.fim = aux;
        this.tamanho++;
        
       
    }
    
    public void remover(Carta pokemon){
        int pos = getIndex(pokemon);
        
        if(tamanho>pos && pos>0){
            removerSelecao(pos);
        }else if(pos == 0){
            removerPrimeiro();
        }
    }
    
    private void removerPrimeiro(){
        this.inicio = this.inicio.getProximo();
        this.tamanho--;
    }
    
    private void removerUltimo(){
        Carta rmv = this.inicio;
        Carta antRmv;
        for(int i = 1; i<tamanho() - 1;i++){
            rmv = rmv.getProximo();
        }
        
        antRmv = rmv.getProximo();
        rmv.setProximo(null);
        System.gc();
        this.tamanho--;
       
    }
    
    private int getIndex(Carta pokemon){
        Carta aux = this.inicio;
        int i;   
        for(i = 0; (!aux.getNome().equals(pokemon.getNome()));i++ ){
            aux = aux.getProximo();
        }
        
        return i;
    }
    
    private void removerSelecao(int pos){
        Carta rmv = this.inicio;
        Carta antRmv = rmv.getPokemon();
        for(int i = 0; i<pos;i++){
            antRmv = rmv;
            rmv = rmv.getProximo();
        }
        antRmv.setProximo(rmv.getProximo());
        rmv = null;
        System.gc();
        this.tamanho--;
    }
    
    public void imprimir(){
        Carta aux = this.inicio;
        for(int i = 0; i<tamanho(); i++){
            System.out.printf("\n[%d] - %s ",i, aux.getNome());
            aux = aux.getProximo();
        }
    }
    
    public Carta escolher(int pos){
        Carta esc = this.inicio;
        for(int i = 0; i<pos;i++){
            esc = esc.getProximo();
        }
        
        return esc;
    }
    
    public void imprimirStatus(){
        Carta aux = this.inicio;
        for(int i = 0; i<tamanho(); i++){
            aux.status();
            aux = aux.getProximo();
        }
    }
}
