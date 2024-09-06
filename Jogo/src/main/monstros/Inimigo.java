/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.monstros;

import main.armas.Arma;
import main.armas.Escudo;

/**
 *
 * @author lucas.amsantos4
 */
public class Inimigo {
    String nome;
    int saude;
    int danoBase;
    Arma arma;
    Escudo escudo;
    
    public int dano(){
        int ataque = danoBase+arma.dano();
        return ataque;
    };
    
    public int ataque(){
        int danoTotal;
        if(arma == null) danoTotal = danoBase;
        else danoTotal = dano();
        return danoTotal;
    }
    
    public int atqRecebido(int dano){
        int totalRecebido;
        if(escudo == null) totalRecebido = dano;
        else totalRecebido = defesa(dano);
        
        saude -= totalRecebido;
        if(saude < 0){
            saude = 0;
            System.out.printf("\n%s morto.", this.nome);
        }
        return totalRecebido;
    }
    
    private int defesa(int atq){
        int defendido = escudo.defesa() - atq;
        if(defendido < 0) return 0;
        return defendido;
    }
    
    public void status(){
        if(arma ==null)System.out.printf("\n%s: saude %d - dano %d",nome, saude, danoBase);
        else System.out.printf("\n%s: saude %d - dano %d",nome, saude, dano());
    }
   
}
