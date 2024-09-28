/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jogoed;

import java.util.Random;
import java.util.Scanner;
import jogoed.cartas.Alakazam;
import jogoed.cartas.Arbok;
import jogoed.cartas.Blastoise;
import jogoed.cartas.Carta;
import jogoed.cartas.Charizard;
import jogoed.cartas.Electabuzz;
import jogoed.cartas.Ninetales;
import jogoed.cartas.Primeape;
import jogoed.cartas.Raticate;
import jogoed.cartas.Sandslash;
import jogoed.cartas.Venusaur;

/**
 *
 * @author lucas.amsantos4
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int atributo;
        Carta cartaJg1;
        Carta cartaJg2;
        Scanner sc = new Scanner(System.in);
        Deck deck = iniciar();
        
        
        deck.imprimir();
        System.out.println("Jogador 1 escolha as cartas:\n");
        Deck jogador1 = criaDeck(deck);
        
        
        deck.imprimir();
        System.out.println("Jogador 2 escolha as cartas:\n");
        Deck jogador2 = criaDeck(deck);
        Random random = new Random();
        
        int randomN;
        
        while(!jogador2.deckVazio() && !jogador1.deckVazio()){
            randomN = random.nextInt(2)+1;
            System.out.println("\nJogador "+randomN+" escolhe atributo!");
            System.out.println("\nEscolha entre [1] - def [2] - atq");
            atributo = sc.nextInt();
            
            jogador1.imprimir();
            System.out.println("\nJogador 1 escolha a carta");
            
            cartaJg1 = jogador1.escolher(sc.nextInt());
            
            jogador2.imprimir();
            
            System.out.println("\nJogador 2 escolha a carta");
            
            cartaJg2 = jogador2.escolher(sc.nextInt());
            
            if(atributo == 1){
                if(combateDef(cartaJg1, cartaJg2)==1){
                    jogador2.remover(cartaJg2);
                    System.out.println("Jogador 2 perdeu a carta");
                }else{
                    jogador1.remover(cartaJg1);
                    System.out.println("Jogador 1 perdeu a carta");
                }
            }else{
                
                if(combateAtq(cartaJg1, cartaJg2)==1){
                    jogador2.remover(cartaJg2);
                    System.out.println("Jogador 2 perdeu a carta");
                }else{
                    jogador1.remover(cartaJg1);
                    System.out.println("Jogador 1 perdeu a carta");
                }
            }
        }
        
        if(jogador1.deckVazio()){
            System.out.println("Jogador 1 Perdeu---------------");
        }else if(jogador2.deckVazio()){
            System.out.println("Jogador 2 Perdeu---------------");
        }
        
        
        
    }
    
    public static int combateAtq(Carta pokn1, Carta pokn2){
        int v1=1, v2=1;
        int vantagem = vangatem(pokn1, pokn2);
        if(vantagem!=0){
            if(vantagem == 1){
                
                v1+=1;
            }else if(vantagem == 2){
                
                v2+=1;
            } 
        }
        if(pokn1.getAtq()*v1>pokn2.getAtq()*v2){
            return 1;
        }
        return 2;
    }
    
    public static int combateDef(Carta pokn1, Carta pokn2){
        int v1=1, v2=1;
        int vantagem = vangatem(pokn1, pokn2);
        if(vantagem!=0){
            if(vantagem == 1){
                v1+=1;
            }else if(vantagem == 2){
                v2+=1;
            } 
        }
        
        if(pokn1.getDef()*v1>pokn2.getDef()*v2){
            return 1;
        }
        return 2;
    }
    
    public static int vangatem(Carta pokn1, Carta pokn2){
        String tN1 = pokn1.getTipo(), tN2 = pokn2.getTipo();
        int v = 0;
        if(tN1.equals("Normal")){
            return 0;
        }
        if(tN2.equals("Normal")){
            return 0;
        }
        
        if(!tN1.equals(tN2)){
            if ((tN1.equalsIgnoreCase("Fogo") && tN2.equalsIgnoreCase("Planta")) ||
                    (tN1.equalsIgnoreCase("Planta") && tN2.equalsIgnoreCase("Agua")) ||
                    (tN1.equalsIgnoreCase("Agua") && tN2.equalsIgnoreCase("Fogo"))) {
                return 1; // Jogador 1 ganha
            } else {
                return 2; // Jogador 2 ganha
            }
        }
        return v;
    }
    
    public static Deck iniciar(){
       
        Deck todas = new Deck();
        
        todas.insere(new Alakazam());
        
        todas.insere(new Arbok());
        
        todas.insere(new Blastoise());
        
        todas.insere(new Charizard());
        
        todas.insere(new Electabuzz());
        
        todas.insere(new Ninetales());
        todas.insere( new Primeape());
        
        todas.insere(new Raticate());
        
        todas.insere(new Sandslash());
        
        todas.insere(new Venusaur());
        
        todas.imprimirStatus();
        return todas;
    }
    
    public static Deck criaDeck(Deck deck){
        Deck deckJogador = new Deck();
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha suas Cartas");
        for(int i = 0; i<6; i ++){
            System.out.println("["+i+"] Escolha a proxima");
            deckJogador.insere(deck.escolher(sc.nextInt()));
        }
        return deckJogador;
    }
}

