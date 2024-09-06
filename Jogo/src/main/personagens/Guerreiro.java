/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.personagens;

import main.armas.Arma;
import main.armas.Escudo;


/**
 *
 * @author lucas.amsantos4
 */
public class Guerreiro {
    int vida;
    Arma arma;
    Escudo escudo;
    
    public Guerreiro(){
        int vida = 20;
    }
    
    public void armaAtual(Arma arma){
        this.arma = arma;
    }
    
    public void escudoAtual(Escudo escudo){
        this.escudo = escudo;
    }
    
    public int ataque(){
        return arma.dano();
    }
}
